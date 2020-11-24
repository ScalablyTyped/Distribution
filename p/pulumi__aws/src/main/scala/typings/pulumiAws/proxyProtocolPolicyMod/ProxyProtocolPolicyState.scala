package typings.pulumiAws.proxyProtocolPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyProtocolPolicyState extends js.Object {
  
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: js.UndefOr[Input[String]] = js.native
}
object ProxyProtocolPolicyState {
  
  @scala.inline
  def apply(): ProxyProtocolPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyProtocolPolicyState]
  }
  
  @scala.inline
  implicit class ProxyProtocolPolicyStateOps[Self <: ProxyProtocolPolicyState] (val x: Self) extends AnyVal {
    
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
    def setInstancePortsVarargs(value: Input[String]*): Self = this.set("instancePorts", js.Array(value :_*))
    
    @scala.inline
    def setInstancePorts(value: Input[js.Array[Input[String]]]): Self = this.set("instancePorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePorts: Self = this.set("instancePorts", js.undefined)
    
    @scala.inline
    def setLoadBalancer(value: Input[String]): Self = this.set("loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancer: Self = this.set("loadBalancer", js.undefined)
  }
}
