package typings.pulumiKubernetes.outputMod.coordination.v1

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
  val acquireTime: String
  /**
    * holderIdentity contains the identity of the holder of a current lease.
    */
  val holderIdentity: String
  /**
    * leaseDurationSeconds is a duration that candidates for a lease need to wait to force
    * acquire it. This is measure against time of last observed RenewTime.
    */
  val leaseDurationSeconds: Double
  /**
    * leaseTransitions is the number of transitions of a lease between holders.
    */
  val leaseTransitions: Double
  /**
    * renewTime is a time when the current holder of a lease has last updated the lease.
    */
  val renewTime: String
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
}

