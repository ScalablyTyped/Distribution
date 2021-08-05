package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackCustomCookbooksSource extends StObject {
  
  /**
    * Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
    */
  var password: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
    */
  var sshKey: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: Input[String]
  
  /**
    * The URL where the cookbooks resource can be found.
    */
  var url: Input[String]
  
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[Input[String]] = js.undefined
}
object StackCustomCookbooksSource {
  
  inline def apply(`type`: Input[String], url: Input[String]): StackCustomCookbooksSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCustomCookbooksSource]
  }
  
  extension [Self <: StackCustomCookbooksSource](x: Self) {
    
    inline def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRevision(value: Input[String]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setSshKey(value: Input[String]): Self = StObject.set(x, "sshKey", value.asInstanceOf[js.Any])
    
    inline def setSshKeyUndefined: Self = StObject.set(x, "sshKey", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
