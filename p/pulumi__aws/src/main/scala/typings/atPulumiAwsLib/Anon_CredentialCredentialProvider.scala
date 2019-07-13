package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CredentialCredentialProvider extends js.Object {
  var credential: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var credentialProvider: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CredentialCredentialProvider {
  @scala.inline
  def apply(
    credential: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    credentialProvider: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_CredentialCredentialProvider = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CredentialCredentialProvider]
  }
}

