package typings
package atPulumiAwsLib.route53DelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegationSetState extends js.Object {
  /**
    * A list of authoritative name servers for the hosted zone
    * (effectively a list of NS records).
    */
  val nameServers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single delegation set amongst others)
    */
  val referenceName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DelegationSetState {
  @scala.inline
  def apply(
    nameServers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    referenceName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DelegationSetState = {
    val __obj = js.Dynamic.literal()
    if (nameServers != null) __obj.updateDynamic("nameServers")(nameServers.asInstanceOf[js.Any])
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSetState]
  }
}

