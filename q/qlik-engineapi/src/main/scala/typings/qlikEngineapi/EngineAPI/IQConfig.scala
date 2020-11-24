package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.anon.QIsDesktop
import typings.qlikEngineapi.anon.QPathSeparator
import typings.qlikEngineapi.anon.QUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQConfig extends js.Object {
  
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
  implicit class IQConfigOps[Self <: IQConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQFeatures(value: QIsDesktop): Self = this.set("qFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQServicesVarargs(value: QUrl*): Self = this.set("qServices", js.Array(value :_*))
    
    @scala.inline
    def setQServices(value: js.Array[QUrl]): Self = this.set("qServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSystemProperties(value: QPathSeparator): Self = this.set("qSystemProperties", value.asInstanceOf[js.Any])
  }
}
