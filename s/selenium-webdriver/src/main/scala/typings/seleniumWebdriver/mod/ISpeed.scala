package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpeed extends StObject {
  
  var xspeed: Double = js.native
  
  var yspeed: Double = js.native
}
object ISpeed {
  
  @scala.inline
  def apply(xspeed: Double, yspeed: Double): ISpeed = {
    val __obj = js.Dynamic.literal(xspeed = xspeed.asInstanceOf[js.Any], yspeed = yspeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeed]
  }
  
  @scala.inline
  implicit class ISpeedMutableBuilder[Self <: ISpeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXspeed(value: Double): Self = StObject.set(x, "xspeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYspeed(value: Double): Self = StObject.set(x, "yspeed", value.asInstanceOf[js.Any])
  }
}
