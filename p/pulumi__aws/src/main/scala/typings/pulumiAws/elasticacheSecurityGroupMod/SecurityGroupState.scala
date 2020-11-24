package typings.pulumiAws.elasticacheSecurityGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupState extends js.Object {
  
  /**
    * description for the cache security group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name for the cache security group. This value is stored as a lowercase string.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of EC2 security group names to be
    * authorized for ingress to the cache security group
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object SecurityGroupState {
  
  @scala.inline
  def apply(): SecurityGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupState]
  }
  
  @scala.inline
  implicit class SecurityGroupStateOps[Self <: SecurityGroupState] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSecurityGroupNamesVarargs(value: Input[String]*): Self = this.set("securityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupNames: Self = this.set("securityGroupNames", js.undefined)
  }
}
