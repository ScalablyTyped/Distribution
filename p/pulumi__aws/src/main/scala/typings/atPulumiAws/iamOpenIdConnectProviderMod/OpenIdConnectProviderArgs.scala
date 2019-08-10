package typings.atPulumiAws.iamOpenIdConnectProviderMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIdConnectProviderArgs extends js.Object {
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
    */
  val clientIdLists: Input[js.Array[Input[String]]]
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
    */
  val thumbprintLists: Input[js.Array[Input[String]]]
  /**
    * The URL of the identity provider. Corresponds to the _iss_ claim.
    */
  val url: Input[String]
}

object OpenIdConnectProviderArgs {
  @scala.inline
  def apply(
    clientIdLists: Input[js.Array[Input[String]]],
    thumbprintLists: Input[js.Array[Input[String]]],
    url: Input[String]
  ): OpenIdConnectProviderArgs = {
    val __obj = js.Dynamic.literal(clientIdLists = clientIdLists.asInstanceOf[js.Any], thumbprintLists = thumbprintLists.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenIdConnectProviderArgs]
  }
}

