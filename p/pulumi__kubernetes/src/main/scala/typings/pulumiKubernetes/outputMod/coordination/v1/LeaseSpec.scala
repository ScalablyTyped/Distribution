package typings.pulumiKubernetes.outputMod.coordination.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LeaseSpec is a specification of a Lease.
  */
@js.native
trait LeaseSpec extends js.Object {
  
  /**
    * acquireTime is a time when the current lease was acquired.
    */
  var acquireTime: String = js.native
  
  /**
    * holderIdentity contains the identity of the holder of a current lease.
    */
  var holderIdentity: String = js.native
  
  /**
    * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
    */
  var leaseDurationSeconds: Double = js.native
  
  /**
    * leaseTransitions is the number of transitions of a lease between holders.
    */
  var leaseTransitions: Double = js.native
  
  /**
    * renewTime is a time when the current holder of a lease has last updated the lease.
    */
  var renewTime: String = js.native
}
object LeaseSpec {
  
  @scala.inline
  def apply(
    acquireTime: String,
    holderIdentity: String,
    leaseDurationSeconds: Double,
    leaseTransitions: Double,
    renewTime: String
  ): LeaseSpec = {
    val __obj = js.Dynamic.literal(acquireTime = acquireTime.asInstanceOf[js.Any], holderIdentity = holderIdentity.asInstanceOf[js.Any], leaseDurationSeconds = leaseDurationSeconds.asInstanceOf[js.Any], leaseTransitions = leaseTransitions.asInstanceOf[js.Any], renewTime = renewTime.asInstanceOf[js.Any])
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
    def setAcquireTime(value: String): Self = this.set("acquireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolderIdentity(value: String): Self = this.set("holderIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseDurationSeconds(value: Double): Self = this.set("leaseDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseTransitions(value: Double): Self = this.set("leaseTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewTime(value: String): Self = this.set("renewTime", value.asInstanceOf[js.Any])
  }
}
