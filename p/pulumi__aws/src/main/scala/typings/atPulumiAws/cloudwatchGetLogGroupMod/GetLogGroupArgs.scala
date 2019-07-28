package typings.atPulumiAws.cloudwatchGetLogGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogGroupArgs extends js.Object {
  /**
    * The name of the Cloudwatch log group
    */
  val name: String
}

object GetLogGroupArgs {
  @scala.inline
  def apply(name: String): GetLogGroupArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetLogGroupArgs]
  }
}

