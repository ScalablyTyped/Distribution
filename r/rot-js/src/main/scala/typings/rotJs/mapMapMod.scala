package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMapMod {
  
  @JSImport("rot-js/lib/map/map", JSImport.Default)
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
  
  @js.native
  trait Map extends StObject {
    
    def _fillMap(value: Double): js.Array[js.Array[Double]] = js.native
    
    var _height: Double = js.native
    
    var _width: Double = js.native
    
    def create(): Unit = js.native
    def create(callback: CreateCallback): Unit = js.native
  }
}
