package typings
package atPulumiAwsLib.directoryserviceConditionalForwaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalForwaderArgs extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ConditionalForwaderArgs {
  @scala.inline
  def apply(
    directoryId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dnsIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    remoteDomainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ConditionalForwaderArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryId")(directoryId.asInstanceOf[js.Any])
    __obj.updateDynamic("dnsIps")(dnsIps.asInstanceOf[js.Any])
    __obj.updateDynamic("remoteDomainName")(remoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalForwaderArgs]
  }
}

