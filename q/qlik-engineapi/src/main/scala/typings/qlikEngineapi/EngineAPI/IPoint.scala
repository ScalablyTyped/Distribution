package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Point...
  */
@js.native
trait IPoint extends StObject {
  
  /**
    * x-coordinate in pixels.
    * The origin is the top left of the screen.
    */
  var qx: Double = js.native
  
  /**
    * y-coordinate in pixels.
    * The origin is the top left of the screen.
    */
  var qy: Double = js.native
}
object IPoint {
  
  @scala.inline
  def apply(qx: Double, qy: Double): IPoint = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPoint]
  }
  
  @scala.inline
  implicit class IPointMutableBuilder[Self <: IPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
  }
}
