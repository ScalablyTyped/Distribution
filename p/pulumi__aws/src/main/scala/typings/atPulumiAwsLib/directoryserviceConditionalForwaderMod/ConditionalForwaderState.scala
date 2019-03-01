package typings
package atPulumiAwsLib.directoryserviceConditionalForwaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalForwaderState extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ConditionalForwaderState {
  @scala.inline
  def apply(
    directoryId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dnsIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    remoteDomainName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ConditionalForwaderState = {
    val __obj = js.Dynamic.literal()
    if (directoryId != null) __obj.updateDynamic("directoryId")(directoryId.asInstanceOf[js.Any])
    if (dnsIps != null) __obj.updateDynamic("dnsIps")(dnsIps.asInstanceOf[js.Any])
    if (remoteDomainName != null) __obj.updateDynamic("remoteDomainName")(remoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalForwaderState]
  }
}

