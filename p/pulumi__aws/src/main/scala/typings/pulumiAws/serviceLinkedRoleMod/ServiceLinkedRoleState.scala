package typings.pulumiAws.serviceLinkedRoleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLinkedRoleState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
    */
  val awsServiceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The creation date of the IAM role.
    */
  val createDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * Additional string appended to the role name. Not all AWS services support custom suffixes.
    */
  val customSuffix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the role.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the role.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The path of the role.
    */
  val path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}
object ServiceLinkedRoleState {
  
  @scala.inline
  def apply(): ServiceLinkedRoleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLinkedRoleState]
  }
  
  @scala.inline
  implicit class ServiceLinkedRoleStateOps[Self <: ServiceLinkedRoleState] (val x: Self) extends AnyVal {
    
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
    def setAwsServiceName(value: Input[String]): Self = this.set("awsServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsServiceName: Self = this.set("awsServiceName", js.undefined)
    
    @scala.inline
    def setCreateDate(value: Input[String]): Self = this.set("createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("createDate", js.undefined)
    
    @scala.inline
    def setCustomSuffix(value: Input[String]): Self = this.set("customSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSuffix: Self = this.set("customSuffix", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setUniqueId(value: Input[String]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
}
