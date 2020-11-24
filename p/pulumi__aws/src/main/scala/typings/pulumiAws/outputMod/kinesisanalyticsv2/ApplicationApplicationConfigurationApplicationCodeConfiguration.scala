package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationApplicationCodeConfiguration extends js.Object {
  
  /**
    * The location and type of the application code.
    */
  var codeContent: js.UndefOr[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent] = js.native
  
  /**
    * Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
    */
  var codeContentType: String = js.native
}
object ApplicationApplicationConfigurationApplicationCodeConfiguration {
  
  @scala.inline
  def apply(codeContentType: String): ApplicationApplicationConfigurationApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(codeContentType = codeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationApplicationCodeConfigurationOps[Self <: ApplicationApplicationConfigurationApplicationCodeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCodeContentType(value: String): Self = this.set("codeContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContent(value: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent): Self = this.set("codeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeContent: Self = this.set("codeContent", js.undefined)
  }
}
