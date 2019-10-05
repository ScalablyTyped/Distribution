package typings.atPulumiKubernetes.typesInputMod.coordination.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LeaseSpec is a specification of a Lease.
  */
trait LeaseSpec extends js.Object {
  /**
    * acquireTime is a time when the current lease was acquired.
    */
  var acquireTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * holderIdentity contains the identity of the holder of a current lease.
    */
  var holderIdentity: js.UndefOr[Input[String]] = js.undefined
  /**
    * leaseDurationSeconds is a duration that candidates for a lease need to wait to force
    * acquire it. This is measure against time of last observed RenewTime.
    */
  var leaseDurationSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * leaseTransitions is the number of transitions of a lease between holders.
    */
  var leaseTransitions: js.UndefOr[Input[Double]] = js.undefined
  /**
    * renewTime is a time when the current holder of a lease has last updated the lease.
    */
  var renewTime: js.UndefOr[Input[String]] = js.undefined
}

object LeaseSpec {
  @scala.inline
  def apply(
    acquireTime: Input[String] = null,
    holderIdentity: Input[String] = null,
    leaseDurationSeconds: Input[Double] = null,
    leaseTransitions: Input[Double] = null,
    renewTime: Input[String] = null
  ): LeaseSpec = {
    val __obj = js.Dynamic.literal()
    if (acquireTime != null) __obj.updateDynamic("acquireTime")(acquireTime.asInstanceOf[js.Any])
    if (holderIdentity != null) __obj.updateDynamic("holderIdentity")(holderIdentity.asInstanceOf[js.Any])
    if (leaseDurationSeconds != null) __obj.updateDynamic("leaseDurationSeconds")(leaseDurationSeconds.asInstanceOf[js.Any])
    if (leaseTransitions != null) __obj.updateDynamic("leaseTransitions")(leaseTransitions.asInstanceOf[js.Any])
    if (renewTime != null) __obj.updateDynamic("renewTime")(renewTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseSpec]
  }
}

