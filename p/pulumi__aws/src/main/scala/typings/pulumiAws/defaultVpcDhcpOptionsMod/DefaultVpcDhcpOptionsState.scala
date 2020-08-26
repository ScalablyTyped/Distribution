package typings.pulumiAws.defaultVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultVpcDhcpOptionsState extends js.Object {
  /**
    * The ARN of the DHCP Options Set.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  val domainName: js.UndefOr[Input[String]] = js.native
  val domainNameServers: js.UndefOr[Input[String]] = js.native
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: js.UndefOr[Input[String]] = js.native
  val ntpServers: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DefaultVpcDhcpOptionsState {
  @scala.inline
  def apply(): DefaultVpcDhcpOptionsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultVpcDhcpOptionsState]
  }
  @scala.inline
  implicit class DefaultVpcDhcpOptionsStateOps[Self <: DefaultVpcDhcpOptionsState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setDomainNameServers(value: Input[String]): Self = this.set("domainNameServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainNameServers: Self = this.set("domainNameServers", js.undefined)
    @scala.inline
    def setNetbiosNameServersVarargs(value: Input[String]*): Self = this.set("netbiosNameServers", js.Array(value :_*))
    @scala.inline
    def setNetbiosNameServers(value: Input[js.Array[Input[String]]]): Self = this.set("netbiosNameServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetbiosNameServers: Self = this.set("netbiosNameServers", js.undefined)
    @scala.inline
    def setNetbiosNodeType(value: Input[String]): Self = this.set("netbiosNodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetbiosNodeType: Self = this.set("netbiosNodeType", js.undefined)
    @scala.inline
    def setNtpServers(value: Input[String]): Self = this.set("ntpServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNtpServers: Self = this.set("ntpServers", js.undefined)
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

