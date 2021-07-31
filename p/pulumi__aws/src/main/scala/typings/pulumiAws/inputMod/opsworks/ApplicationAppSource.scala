package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationAppSource extends StObject {
  
  /**
    * Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
    */
  var password: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
    */
  var sshKey: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: Input[String]
  
  /**
    * The URL where the app resource can be found.
    */
  var url: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[Input[String]] = js.undefined
}
object ApplicationAppSource {
  
  @scala.inline
  def apply(`type`: Input[String]): ApplicationAppSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationAppSource]
  }
  
  @scala.inline
  implicit class ApplicationAppSourceMutableBuilder[Self <: ApplicationAppSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRevision(value: Input[String]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    @scala.inline
    def setSshKey(value: Input[String]): Self = StObject.set(x, "sshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyUndefined: Self = StObject.set(x, "sshKey", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
