package typings.pulumiKubernetes.inputMod.certificates.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
trait CertificateSigningRequestCondition extends js.Object {
  /**
    * timestamp for the last update to this condition
    */
  var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * human readable message with details about the request state
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * brief reason for the request state
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * request approval state, currently Approved or Denied.
    */
  var `type`: Input[String]
}

object CertificateSigningRequestCondition {
  @scala.inline
  def apply(
    `type`: Input[String],
    lastUpdateTime: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null
  ): CertificateSigningRequestCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestCondition]
  }
}

