package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapMapMod {
  
  /* note: abstract class */ @JSImport("rot-js/lib/map/map", JSImport.Default)
  @js.native
  /**
    * @class Base map generator
    * @param {int} [width=ROT.DEFAULT_WIDTH]
    * @param {int} [height=ROT.DEFAULT_HEIGHT]
    */
  open class default ()
    extends StObject
       with Map {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
  }
  
  type CreateCallback = js.Function3[/* x */ Double, /* y */ Double, /* contents */ Double, Any]
  
  @js.native
  trait Map extends StObject {
    
    def _fillMap(value: Double): js.Array[js.Array[Double]] = js.native
    
    var _height: Double = js.native
    
    var _width: Double = js.native
    
    def create(): Unit = js.native
    def create(callback: CreateCallback): Unit = js.native
  }
}
