package typings.atPulumiAws.directoryserviceConditionalForwaderMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalForwaderArgs extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: Input[String] = js.native
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: Input[js.Array[Input[String]]] = js.native
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: Input[String] = js.native
}

object ConditionalForwaderArgs {
  @scala.inline
  def apply(
    directoryId: Input[String],
    dnsIps: Input[js.Array[Input[String]]],
    remoteDomainName: Input[String]
  ): ConditionalForwaderArgs = {
    val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any], dnsIps = dnsIps.asInstanceOf[js.Any], remoteDomainName = remoteDomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConditionalForwaderArgs]
  }
}

