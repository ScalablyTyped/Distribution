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

object CertificateSigningRequestCondition {
  @scala.inline
  def apply(
    lastUpdateTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    `type`: java.lang.String
  ): CertificateSigningRequestCondition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[CertificateSigningRequestCondition]
  }
}

