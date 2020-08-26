package typings.pulumiAws.conditionalForwaderMod

import typings.pulumiPulumi.outputMod.Input
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
  def apply(): ConditionalForwaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalForwaderState]
  }
  @scala.inline
  implicit class ConditionalForwaderStateOps[Self <: ConditionalForwaderState] (val x: Self) extends AnyVal {
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
    def deleteDirectoryId: Self = this.set("directoryId", js.undefined)
    @scala.inline
    def setDnsIpsVarargs(value: Input[String]*): Self = this.set("dnsIps", js.Array(value :_*))
    @scala.inline
    def setDnsIps(value: Input[js.Array[Input[String]]]): Self = this.set("dnsIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsIps: Self = this.set("dnsIps", js.undefined)
    @scala.inline
    def setRemoteDomainName(value: Input[String]): Self = this.set("remoteDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteDomainName: Self = this.set("remoteDomainName", js.undefined)
  }
  
}

