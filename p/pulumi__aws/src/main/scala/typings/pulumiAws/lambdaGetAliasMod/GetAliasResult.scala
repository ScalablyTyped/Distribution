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
    * id is the provider-assigned unique ID for this managed resource.
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
}

