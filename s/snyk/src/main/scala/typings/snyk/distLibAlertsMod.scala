package typings.snyk

import typings.snyk.snykStrings.error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAlertsMod {
  
  @JSImport("snyk/dist/lib/alerts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def displayAlerts(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("displayAlerts")().asInstanceOf[String]
  
  inline def hasAlert(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAlert")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerAlerts(alerts: js.Array[Alert]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAlerts")(alerts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Alert extends StObject {
    
    var msg: String
    
    var name: String
    
    var `type`: AlertType
  }
  object Alert {
    
    inline def apply(msg: String, name: String, `type`: AlertType): Alert = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alert]
    }
    
    extension [Self <: Alert](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.snyk.snykStrings.info
    - typings.snyk.snykStrings.warning
    - typings.snyk.snykStrings.error_
  */
  trait AlertType extends StObject
  object AlertType {
    
    inline def error: error_ = "error".asInstanceOf[error_]
    
    inline def info: typings.snyk.snykStrings.info = "info".asInstanceOf[typings.snyk.snykStrings.info]
    
    inline def warning: typings.snyk.snykStrings.warning = "warning".asInstanceOf[typings.snyk.snykStrings.warning]
  }
}
