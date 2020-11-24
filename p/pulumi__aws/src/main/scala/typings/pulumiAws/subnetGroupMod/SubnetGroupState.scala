package typings.pulumiAws.subnetGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetGroupState extends js.Object {
  
  /**
    * A description of the subnet group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the subnet group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * VPC ID of the subnet group.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object SubnetGroupState {
  
  @scala.inline
  def apply(): SubnetGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetGroupState]
  }
  
  @scala.inline
  implicit class SubnetGroupStateOps[Self <: SubnetGroupState] (val x: Self) extends AnyVal {
    
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
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
