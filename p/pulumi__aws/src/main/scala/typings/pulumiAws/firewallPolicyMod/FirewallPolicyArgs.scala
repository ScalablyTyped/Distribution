package typings.pulumiAws.firewallPolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.networkfirewall.FirewallPolicyFirewallPolicy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyArgs extends js.Object {
  
  /**
    * A friendly description of the firewall policy.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
    */
  val firewallPolicy: Input[FirewallPolicyFirewallPolicy] = js.native
  
  /**
    * A friendly name of the firewall policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object FirewallPolicyArgs {
  
  @scala.inline
  def apply(firewallPolicy: Input[FirewallPolicyFirewallPolicy]): FirewallPolicyArgs = {
    val __obj = js.Dynamic.literal(firewallPolicy = firewallPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyArgs]
  }
  
  @scala.inline
  implicit class FirewallPolicyArgsOps[Self <: FirewallPolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setFirewallPolicy(value: Input[FirewallPolicyFirewallPolicy]): Self = this.set("firewallPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
