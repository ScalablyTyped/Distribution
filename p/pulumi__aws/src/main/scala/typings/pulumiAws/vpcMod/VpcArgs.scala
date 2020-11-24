package typings.pulumiAws.vpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcArgs extends js.Object {
  
  /**
    * Requests an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or
    * the size of the CIDR block. Default is `false`.
    */
  val assignGeneratedIpv6CidrBlock: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The CIDR block for the VPC.
    */
  val cidrBlock: Input[String] = js.native
  
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
    * Only valid in regions and accounts that support EC2 Classic.
    */
  val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A tenancy option for instances launched into the VPC. Default is `default`, which
    * makes your instances shared on the host. Using either of the other options (`dedicated` or `host`) costs at least $2/hr.
    */
  val instanceTenancy: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object VpcArgs {
  
  @scala.inline
  def apply(cidrBlock: Input[String]): VpcArgs = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcArgs]
  }
  
  @scala.inline
  implicit class VpcArgsOps[Self <: VpcArgs] (val x: Self) extends AnyVal {
    
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
    def setCidrBlock(value: Input[String]): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignGeneratedIpv6CidrBlock(value: Input[Boolean]): Self = this.set("assignGeneratedIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignGeneratedIpv6CidrBlock: Self = this.set("assignGeneratedIpv6CidrBlock", js.undefined)
    
    @scala.inline
    def setEnableClassiclink(value: Input[Boolean]): Self = this.set("enableClassiclink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClassiclink: Self = this.set("enableClassiclink", js.undefined)
    
    @scala.inline
    def setEnableClassiclinkDnsSupport(value: Input[Boolean]): Self = this.set("enableClassiclinkDnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClassiclinkDnsSupport: Self = this.set("enableClassiclinkDnsSupport", js.undefined)
    
    @scala.inline
    def setEnableDnsHostnames(value: Input[Boolean]): Self = this.set("enableDnsHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDnsHostnames: Self = this.set("enableDnsHostnames", js.undefined)
    
    @scala.inline
    def setEnableDnsSupport(value: Input[Boolean]): Self = this.set("enableDnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDnsSupport: Self = this.set("enableDnsSupport", js.undefined)
    
    @scala.inline
    def setInstanceTenancy(value: Input[String]): Self = this.set("instanceTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTenancy: Self = this.set("instanceTenancy", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
