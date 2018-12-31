package typings
package atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns

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
  val acquireTime: java.lang.String
  /**
    * holderIdentity contains the identity of the holder of a current lease.
    */
  val holderIdentity: java.lang.String
  /**
    * leaseDurationSeconds is a duration that candidates for a lease need to wait to force
    * acquire it. This is measure against time of last observed RenewTime.
    */
  val leaseDurationSeconds: scala.Double
  /**
    * leaseTransitions is the number of transitions of a lease between holders.
    */
  val leaseTransitions: scala.Double
  /**
    * renewTime is a time when the current holder of a lease has last updated the lease.
    */
  val renewTime: java.lang.String
}

