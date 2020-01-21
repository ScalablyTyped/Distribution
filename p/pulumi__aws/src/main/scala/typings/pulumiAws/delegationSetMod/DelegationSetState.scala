package typings.pulumiAws.delegationSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationSetState extends js.Object {
  /**
    * A list of authoritative name servers for the hosted zone
    * (effectively a list of NS records).
    */
  val nameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single delegation set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.native
}

object DelegationSetState {
  @scala.inline
  def apply(nameServers: Input[js.Array[Input[String]]] = null, referenceName: Input[String] = null): DelegationSetState = {
    val __obj = js.Dynamic.literal()
    if (nameServers != null) __obj.updateDynamic("nameServers")(nameServers.asInstanceOf[js.Any])
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSetState]
  }
}

