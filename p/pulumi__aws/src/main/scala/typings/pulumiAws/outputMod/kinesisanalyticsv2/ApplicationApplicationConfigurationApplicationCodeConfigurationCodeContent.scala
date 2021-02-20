package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent extends StObject {
  
  /**
    * Information about the Amazon S3 bucket containing the application code.
    */
  var s3ContentLocation: js.UndefOr[
    ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation
  ] = js.native
  
  /**
    * The text-format code for the application.
    */
  var textContent: js.UndefOr[String] = js.native
}
object ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentMutableBuilder[Self <: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3ContentLocation(value: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation): Self = StObject.set(x, "s3ContentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ContentLocationUndefined: Self = StObject.set(x, "s3ContentLocation", js.undefined)
    
    @scala.inline
    def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
  }
}
