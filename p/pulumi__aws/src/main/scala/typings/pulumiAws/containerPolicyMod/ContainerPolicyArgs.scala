package typings.pulumiAws.containerPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerPolicyArgs extends js.Object {
  
  /**
    * The name of the container.
    */
  val containerName: Input[String] = js.native
  
  /**
    * The contents of the policy.
    */
  val policy: Input[String] = js.native
}
object ContainerPolicyArgs {
  
  @scala.inline
  def apply(containerName: Input[String], policy: Input[String]): ContainerPolicyArgs = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPolicyArgs]
  }
  
  @scala.inline
  implicit class ContainerPolicyArgsOps[Self <: ContainerPolicyArgs] (val x: Self) extends AnyVal {
    
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
    def setContainerName(value: Input[String]): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
}
