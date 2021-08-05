package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.anon.QIsDesktop
import typings.qlikEngineapi.anon.QPathSeparator
import typings.qlikEngineapi.anon.QUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQConfig extends StObject {
  
  var qFeatures: QIsDesktop
  
  var qServices: js.Array[QUrl]
  
  var qSystemProperties: QPathSeparator
}
object IQConfig {
  
  inline def apply(qFeatures: QIsDesktop, qServices: js.Array[QUrl], qSystemProperties: QPathSeparator): IQConfig = {
    val __obj = js.Dynamic.literal(qFeatures = qFeatures.asInstanceOf[js.Any], qServices = qServices.asInstanceOf[js.Any], qSystemProperties = qSystemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQConfig]
  }
  
  extension [Self <: IQConfig](x: Self) {
    
    inline def setQFeatures(value: QIsDesktop): Self = StObject.set(x, "qFeatures", value.asInstanceOf[js.Any])
    
    inline def setQServices(value: js.Array[QUrl]): Self = StObject.set(x, "qServices", value.asInstanceOf[js.Any])
    
    inline def setQServicesVarargs(value: QUrl*): Self = StObject.set(x, "qServices", js.Array(value :_*))
    
    inline def setQSystemProperties(value: QPathSeparator): Self = StObject.set(x, "qSystemProperties", value.asInstanceOf[js.Any])
  }
}
