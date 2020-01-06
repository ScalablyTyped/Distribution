package typings.atPulumiAws.iamOpenIdConnectProviderMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenIdConnectProviderState extends js.Object {
  /**
    * The ARN assigned by AWS for this provider.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
    */
  val clientIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
    */
  val thumbprintLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The URL of the identity provider. Corresponds to the _iss_ claim.
    */
  val url: js.UndefOr[Input[String]] = js.native
}

object OpenIdConnectProviderState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    clientIdLists: Input[js.Array[Input[String]]] = null,
    thumbprintLists: Input[js.Array[Input[String]]] = null,
    url: Input[String] = null
  ): OpenIdConnectProviderState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clientIdLists != null) __obj.updateDynamic("clientIdLists")(clientIdLists.asInstanceOf[js.Any])
    if (thumbprintLists != null) __obj.updateDynamic("thumbprintLists")(thumbprintLists.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIdConnectProviderState]
  }
}

