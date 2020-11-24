package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent extends js.Object {
  
  /**
    * Information about the Amazon S3 bucket containing the application code.
    */
  var s3ContentLocation: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation
    ]
  ] = js.native
  
  /**
    * The text-format code for the application.
    */
  var textContent: js.UndefOr[Input[String]] = js.native
}
object ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentOps[Self <: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent] (val x: Self) extends AnyVal {
    
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
    def setS3ContentLocation(
      value: Input[
          ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation
        ]
    ): Self = this.set("s3ContentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ContentLocation: Self = this.set("s3ContentLocation", js.undefined)
    
    @scala.inline
    def setTextContent(value: Input[String]): Self = this.set("textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContent: Self = this.set("textContent", js.undefined)
  }
}
