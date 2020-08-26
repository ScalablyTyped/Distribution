package typings.pulumiAws.conditionalForwaderMod

import typings.pulumiPulumi.outputMod.Input
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
  @scala.inline
  implicit class ConditionalForwaderArgsOps[Self <: ConditionalForwaderArgs] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: Input[String]): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDnsIpsVarargs(value: Input[String]*): Self = this.set("dnsIps", js.Array(value :_*))
    @scala.inline
    def setDnsIps(value: Input[js.Array[Input[String]]]): Self = this.set("dnsIps", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteDomainName(value: Input[String]): Self = this.set("remoteDomainName", value.asInstanceOf[js.Any])
  }
  
}

