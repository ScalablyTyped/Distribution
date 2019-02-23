package typings
package atPulumiAwsLib.iamOpenIdConnectProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIdConnectProviderArgs extends js.Object {
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.)
    */
  val clientIdLists: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
    */
  val thumbprintLists: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The URL of the identity provider. Corresponds to the _iss_ claim.
    */
  val url: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

