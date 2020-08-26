package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map/map", JSImport.Namespace)
@js.native
object mapMapMod extends js.Object {
  @js.native
  trait Map extends js.Object {
    var _height: Double = js.native
    var _width: Double = js.native
    def _fillMap(value: Double): js.Array[js.Array[Double]] = js.native
    def create(): Unit = js.native
    def create(callback: CreateCallback): Unit = js.native
  }
  
  @js.native
  /**
    * @class Base map generator
    * @param {int} [width=ROT.DEFAULT_WIDTH]
    * @param {int} [height=ROT.DEFAULT_HEIGHT]
    */
  abstract class default () extends Map {
    def this(width: Double) = this()
    def this(width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(width: Double, height: Double) = this()
  }
  
  type CreateCallback = js.Function3[/* x */ Double, /* y */ Double, /* contents */ Double, js.Any]
}

