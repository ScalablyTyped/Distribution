package typings
package atPulumiAwsLib.apigatewayClientCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCertificateArgs extends js.Object {
  /**
    * The description of the client certificate.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ClientCertificateArgs {
  @scala.inline
  def apply(description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): ClientCertificateArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateArgs]
  }
}

