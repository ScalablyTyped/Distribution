package typings.reactAlert

import typings.reactAlert.mod.AlertManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Alert extends StObject {
    
    var alert: AlertManager = js.native
  }
  object Alert {
    
    @scala.inline
    def apply(alert: AlertManager): Alert = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alert]
    }
    
    @scala.inline
    implicit class AlertMutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: AlertManager): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    }
  }
}
