package typings.pulumiAws.inputMod.route53

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverRuleTargetIp extends js.Object {
  
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var ip: Input[String] = js.native
  
  /**
    * The port at `ip` that you want to forward DNS queries to. Default value is `53`
    */
  var port: js.UndefOr[Input[Double]] = js.native
}
object ResolverRuleTargetIp {
  
  @scala.inline
  def apply(ip: Input[String]): ResolverRuleTargetIp = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleTargetIp]
  }
  
  @scala.inline
  implicit class ResolverRuleTargetIpOps[Self <: ResolverRuleTargetIp] (val x: Self) extends AnyVal {
    
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
    def setIp(value: Input[String]): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
