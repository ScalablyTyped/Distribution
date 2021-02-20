package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceLightEventInit extends EventInit {
  
  var value: js.UndefOr[Double] = js.native
}
object DeviceLightEventInit {
  
  @scala.inline
  def apply(): DeviceLightEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceLightEventInit]
  }
  
  @scala.inline
  implicit class DeviceLightEventInitMutableBuilder[Self <: DeviceLightEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
