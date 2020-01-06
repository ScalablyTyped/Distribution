package typings.atPulumiAws.directoryserviceConditionalForwaderMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalForwaderState extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: js.UndefOr[Input[String]] = js.native
}

object ConditionalForwaderState {
  @scala.inline
  def apply(
    directoryId: Input[String] = null,
    dnsIps: Input[js.Array[Input[String]]] = null,
    remoteDomainName: Input[String] = null
  ): ConditionalForwaderState = {
    val __obj = js.Dynamic.literal()
    if (directoryId != null) __obj.updateDynamic("directoryId")(directoryId.asInstanceOf[js.Any])
    if (dnsIps != null) __obj.updateDynamic("dnsIps")(dnsIps.asInstanceOf[js.Any])
    if (remoteDomainName != null) __obj.updateDynamic("remoteDomainName")(remoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalForwaderState]
  }
}

