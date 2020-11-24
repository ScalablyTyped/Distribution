package typings.pulumiAws.wafIpSetMod

import typings.pulumiAws.inputMod.waf.IpSetIpSetDescriptor
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpSetArgs extends js.Object {
  
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
    */
  val ipSetDescriptors: js.UndefOr[Input[js.Array[Input[IpSetIpSetDescriptor]]]] = js.native
  
  /**
    * The name or description of the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object IpSetArgs {
  
  @scala.inline
  def apply(): IpSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpSetArgs]
  }
  
  @scala.inline
  implicit class IpSetArgsOps[Self <: IpSetArgs] (val x: Self) extends AnyVal {
    
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
    def setIpSetDescriptorsVarargs(value: Input[IpSetIpSetDescriptor]*): Self = this.set("ipSetDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setIpSetDescriptors(value: Input[js.Array[Input[IpSetIpSetDescriptor]]]): Self = this.set("ipSetDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpSetDescriptors: Self = this.set("ipSetDescriptors", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
