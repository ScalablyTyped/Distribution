package typings
package atPulumiAwsLib.ecrGetCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsResult extends js.Object {
  val authorizationToken: java.lang.String
  val expiresAt: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val proxyEndpoint: java.lang.String
}

