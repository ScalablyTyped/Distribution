package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationApplicationCodeConfiguration extends StObject {
  
  /**
    * The location and type of the application code.
    */
  var codeContent: js.UndefOr[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent] = js.undefined
  
  /**
    * Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
    */
  var codeContentType: String
}
object ApplicationApplicationConfigurationApplicationCodeConfiguration {
  
  inline def apply(codeContentType: String): ApplicationApplicationConfigurationApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(codeContentType = codeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationApplicationCodeConfiguration](x: Self) {
    
    inline def setCodeContent(value: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent): Self = StObject.set(x, "codeContent", value.asInstanceOf[js.Any])
    
    inline def setCodeContentType(value: String): Self = StObject.set(x, "codeContentType", value.asInstanceOf[js.Any])
    
    inline def setCodeContentUndefined: Self = StObject.set(x, "codeContent", js.undefined)
  }
}
