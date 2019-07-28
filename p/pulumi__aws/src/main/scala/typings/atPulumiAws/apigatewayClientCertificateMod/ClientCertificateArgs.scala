package typings.atPulumiAws.apigatewayClientCertificateMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCertificateArgs extends js.Object {
  /**
    * The description of the client certificate.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
}

object ClientCertificateArgs {
  @scala.inline
  def apply(description: Input[String] = null): ClientCertificateArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateArgs]
  }
}

