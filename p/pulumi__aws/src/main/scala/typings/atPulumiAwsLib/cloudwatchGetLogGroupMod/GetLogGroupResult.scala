package typings
package atPulumiAwsLib.cloudwatchGetLogGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogGroupResult extends js.Object {
  /**
    * The ARN of the Cloudwatch log group
    */
  val arn: java.lang.String
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  val creationTime: scala.Double
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetLogGroupResult {
  @scala.inline
  def apply(arn: java.lang.String, creationTime: scala.Double, id: java.lang.String): GetLogGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, creationTime = creationTime, id = id)
  
    __obj.asInstanceOf[GetLogGroupResult]
  }
}

