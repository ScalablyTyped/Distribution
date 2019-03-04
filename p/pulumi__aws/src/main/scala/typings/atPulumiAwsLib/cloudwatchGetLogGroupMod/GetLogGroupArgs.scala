package typings
package atPulumiAwsLib.cloudwatchGetLogGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogGroupArgs extends js.Object {
  /**
    * The name of the Cloudwatch log group
    */
  val name: java.lang.String
}

object GetLogGroupArgs {
  @scala.inline
  def apply(name: java.lang.String): GetLogGroupArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetLogGroupArgs]
  }
}

