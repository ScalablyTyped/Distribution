package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CredentialCredentialProvider extends js.Object {
  var credential: Input[String]
  var credentialProvider: Input[String]
}

object Anon_CredentialCredentialProvider {
  @scala.inline
  def apply(credential: Input[String], credentialProvider: Input[String]): Anon_CredentialCredentialProvider = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CredentialCredentialProvider]
  }
}

