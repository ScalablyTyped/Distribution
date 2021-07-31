package typings.pulumiAws.outputMod.opsworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackCustomCookbooksSource extends StObject {
  
  /**
    * Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * For sources that are version-aware, the revision to use.
    */
  var revision: js.UndefOr[String] = js.undefined
  
  /**
    * SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
    */
  var sshKey: js.UndefOr[String] = js.undefined
  
  /**
    * The type of source to use. For example, "archive".
    */
  var `type`: String
  
  /**
    * The URL where the cookbooks resource can be found.
    */
  var url: String
  
  /**
    * Username to use when authenticating to the source.
    */
  var username: js.UndefOr[String] = js.undefined
}
object StackCustomCookbooksSource {
  
  @scala.inline
  def apply(`type`: String, url: String): StackCustomCookbooksSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCustomCookbooksSource]
  }
  
  @scala.inline
  implicit class StackCustomCookbooksSourceMutableBuilder[Self <: StackCustomCookbooksSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    @scala.inline
    def setSshKey(value: String): Self = StObject.set(x, "sshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyUndefined: Self = StObject.set(x, "sshKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
