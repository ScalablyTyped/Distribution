package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  var app: String = js.native
  
  var maxMessageSize: Double = js.native
  
  var sctpmapNumber: Double | String = js.native
}
object App {
  
  @scala.inline
  def apply(app: String, maxMessageSize: Double, sctpmapNumber: Double | String): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], maxMessageSize = maxMessageSize.asInstanceOf[js.Any], sctpmapNumber = sctpmapNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessageSize(value: Double): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSctpmapNumber(value: Double | String): Self = StObject.set(x, "sctpmapNumber", value.asInstanceOf[js.Any])
  }
}
