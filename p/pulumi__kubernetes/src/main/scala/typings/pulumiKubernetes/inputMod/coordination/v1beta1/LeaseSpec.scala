package typings.pulumiKubernetes.inputMod.coordination.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LeaseSpec is a specification of a Lease.
  */
@js.native
trait LeaseSpec extends js.Object {
  /**
    * acquireTime is a time when the current lease was acquired.
    */
  var acquireTime: js.UndefOr[Input[String]] = js.native
  /**
    * holderIdentity contains the identity of the holder of a current lease.
    */
  var holderIdentity: js.UndefOr[Input[String]] = js.native
  /**
    * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
    */
  var leaseDurationSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * leaseTransitions is the number of transitions of a lease between holders.
    */
  var leaseTransitions: js.UndefOr[Input[Double]] = js.native
  /**
    * renewTime is a time when the current holder of a lease has last updated the lease.
    */
  var renewTime: js.UndefOr[Input[String]] = js.native
}

object LeaseSpec {
  @scala.inline
  def apply(): LeaseSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseSpec]
  }
  @scala.inline
  implicit class LeaseSpecOps[Self <: LeaseSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcquireTime(value: Input[String]): Self = this.set("acquireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquireTime: Self = this.set("acquireTime", js.undefined)
    @scala.inline
    def setHolderIdentity(value: Input[String]): Self = this.set("holderIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolderIdentity: Self = this.set("holderIdentity", js.undefined)
    @scala.inline
    def setLeaseDurationSeconds(value: Input[Double]): Self = this.set("leaseDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaseDurationSeconds: Self = this.set("leaseDurationSeconds", js.undefined)
    @scala.inline
    def setLeaseTransitions(value: Input[Double]): Self = this.set("leaseTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaseTransitions: Self = this.set("leaseTransitions", js.undefined)
    @scala.inline
    def setRenewTime(value: Input[String]): Self = this.set("renewTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenewTime: Self = this.set("renewTime", js.undefined)
  }
  
}

