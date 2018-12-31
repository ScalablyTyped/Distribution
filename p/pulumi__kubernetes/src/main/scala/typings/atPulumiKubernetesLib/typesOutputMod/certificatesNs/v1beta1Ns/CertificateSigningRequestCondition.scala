package typings
package atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSigningRequestCondition extends js.Object {
  /**
    * timestamp for the last update to this condition
    */
  val lastUpdateTime: java.lang.String
  /**
    * human readable message with details about the request state
    */
  val message: java.lang.String
  /**
    * brief reason for the request state
    */
  val reason: java.lang.String
  /**
    * request approval state, currently Approved or Denied.
    */
  val `type`: java.lang.String
}

