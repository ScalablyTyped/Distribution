package typings.pulumiAws.environmentEC2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentEC2State extends js.Object {
  
  /**
    * The ARN of the environment.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  val automaticStopTimeMinutes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The description of the environment.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of instance to connect to the environment, e.g. `t2.micro`.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the environment.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
    */
  val ownerArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The type of the environment (e.g. `ssh` or `ec2`)
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object EnvironmentEC2State {
  
  @scala.inline
  def apply(): EnvironmentEC2State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentEC2State]
  }
  
  @scala.inline
  implicit class EnvironmentEC2StateOps[Self <: EnvironmentEC2State] (val x: Self) extends AnyVal {
    
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
    def setAutomaticStopTimeMinutes(value: Input[Double]): Self = this.set("automaticStopTimeMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticStopTimeMinutes: Self = this.set("automaticStopTimeMinutes", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerArn(value: Input[String]): Self = this.set("ownerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerArn: Self = this.set("ownerArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
