package typings.pulumiAws.lambdaGetAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAliasResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the Lambda function alias.
    */
  val arn: String = js.native
  /**
    * Description of alias.
    */
  val description: String = js.native
  val functionName: String = js.native
  /**
    * Lambda function version which the alias uses.
    */
  val functionVersion: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in aws_api_gateway_integration's `uri`.
    */
  val invokeArn: String = js.native
  val name: String = js.native
}

object GetAliasResult {
  @scala.inline
  def apply(
    arn: String,
    description: String,
    functionName: String,
    functionVersion: String,
    id: String,
    invokeArn: String,
    name: String
  ): GetAliasResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invokeArn = invokeArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAliasResult]
  }
  @scala.inline
  implicit class GetAliasResultOps[Self <: GetAliasResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvokeArn(value: String): Self = this.set("invokeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

