package typings
package atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NonResourceAttributes includes the authorization attributes available for non-resource
  * requests to the Authorizer interface
  */
trait NonResourceAttributes extends js.Object {
  /**
    * Path is the URL path of the request
    */
  val path: java.lang.String
  /**
    * Verb is the standard HTTP verb
    */
  val verb: java.lang.String
}

