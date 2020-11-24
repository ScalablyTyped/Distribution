package typings.saml20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.saml20.mod.ValidationOptionsWithKey
  - typings.saml20.mod.ValidationOptionsWithPrint
*/
trait ValidationOptions extends js.Object
object ValidationOptions {
  
  @scala.inline
  def ValidationOptionsWithKey(publicKey: String): ValidationOptions = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  def ValidationOptionsWithPrint(thumbprint: String): ValidationOptions = {
    val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}
