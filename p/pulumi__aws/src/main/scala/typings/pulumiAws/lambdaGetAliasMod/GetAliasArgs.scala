package typings.pulumiAws.lambdaGetAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAliasArgs extends js.Object {
  /**
    * Name of the aliased Lambda function.
    */
  val functionName: String = js.native
  /**
    * Name of the Lambda alias.
    */
  val name: String = js.native
}

object GetAliasArgs {
  @scala.inline
  def apply(functionName: String, name: String): GetAliasArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAliasArgs]
  }
}

