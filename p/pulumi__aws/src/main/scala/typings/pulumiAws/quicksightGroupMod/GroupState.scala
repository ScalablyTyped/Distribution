package typings.pulumiAws.quicksightGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of group
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  val awsAccountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A description for the group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A name for the group.
    */
  val groupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The namespace. Currently, you should set this to `default`.
    */
  val namespace: js.UndefOr[Input[String]] = js.native
}
object GroupState {
  
  @scala.inline
  def apply(): GroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupState]
  }
  
  @scala.inline
  implicit class GroupStateOps[Self <: GroupState] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountId(value: Input[String]): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGroupName(value: Input[String]): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
}
