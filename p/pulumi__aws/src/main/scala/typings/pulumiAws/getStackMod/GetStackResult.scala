package typings.pulumiAws.getStackMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStackResult extends js.Object {
  /**
    * A list of capabilities
    */
  val capabilities: js.Array[String] = js.native
  /**
    * Description of the stack
    */
  val description: String = js.native
  /**
    * Whether the rollback of the stack is disabled when stack creation fails
    */
  val disableRollback: Boolean = js.native
  /**
    * The ARN of the IAM role used to create the stack.
    */
  val iamRoleArn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * A list of SNS topic ARNs to publish stack related events
    */
  val notificationArns: js.Array[String] = js.native
  /**
    * A map of outputs from the stack.
    */
  val outputs: StringDictionary[String] = js.native
  /**
    * A map of parameters that specify input parameters for the stack.
    */
  val parameters: StringDictionary[String] = js.native
  /**
    * A map of tags associated with this stack.
    */
  val tags: StringDictionary[String] = js.native
  /**
    * Structure containing the template body.
    */
  val templateBody: String = js.native
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`
    */
  val timeoutInMinutes: Double = js.native
}

object GetStackResult {
  @scala.inline
  def apply(
    capabilities: js.Array[String],
    description: String,
    disableRollback: Boolean,
    iamRoleArn: String,
    id: String,
    name: String,
    notificationArns: js.Array[String],
    outputs: StringDictionary[String],
    parameters: StringDictionary[String],
    tags: StringDictionary[String],
    templateBody: String,
    timeoutInMinutes: Double
  ): GetStackResult = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disableRollback = disableRollback.asInstanceOf[js.Any], iamRoleArn = iamRoleArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notificationArns = notificationArns.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackResult]
  }
  @scala.inline
  implicit class GetStackResultOps[Self <: GetStackResult] (val x: Self) extends AnyVal {
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
    def setCapabilitiesVarargs(value: String*): Self = this.set("capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableRollback(value: Boolean): Self = this.set("disableRollback", value.asInstanceOf[js.Any])
    @scala.inline
    def setIamRoleArn(value: String): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationArnsVarargs(value: String*): Self = this.set("notificationArns", js.Array(value :_*))
    @scala.inline
    def setNotificationArns(value: js.Array[String]): Self = this.set("notificationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateBody(value: String): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
  }
  
}

