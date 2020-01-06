package typings.atPulumiAws.apigatewayClientCertificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCertificateArgs extends js.Object {
  /**
    * The description of the client certificate.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClientCertificateArgs {
  @scala.inline
  def apply(description: Input[String] = null, tags: Input[StringDictionary[_]] = null): ClientCertificateArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateArgs]
  }
}

