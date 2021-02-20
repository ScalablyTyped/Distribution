package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.anon.QIsDesktop
import typings.qlikEngineapi.anon.QPathSeparator
import typings.qlikEngineapi.anon.QUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQConfig extends StObject {
  
  var qFeatures: QIsDesktop = js.native
  
  var qServices: js.Array[QUrl] = js.native
  
  var qSystemProperties: QPathSeparator = js.native
}
object IQConfig {
  
  @scala.inline
  def apply(qFeatures: QIsDesktop, qServices: js.Array[QUrl], qSystemProperties: QPathSeparator): IQConfig = {
    val __obj = js.Dynamic.literal(qFeatures = qFeatures.asInstanceOf[js.Any], qServices = qServices.asInstanceOf[js.Any], qSystemProperties = qSystemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQConfig]
  }
  
  @scala.inline
  implicit class IQConfigMutableBuilder[Self <: IQConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFeatures(value: QIsDesktop): Self = StObject.set(x, "qFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQServices(value: js.Array[QUrl]): Self = StObject.set(x, "qServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQServicesVarargs(value: QUrl*): Self = StObject.set(x, "qServices", js.Array(value :_*))
    
    @scala.inline
    def setQSystemProperties(value: QPathSeparator): Self = StObject.set(x, "qSystemProperties", value.asInstanceOf[js.Any])
  }
}
