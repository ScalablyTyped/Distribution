package typings.atPulumiAws.cloudwatchGetLogGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogGroupResult extends js.Object {
  /**
    * The ARN of the Cloudwatch log group
    */
  val arn: String
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  val creationTime: Double
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
}

object GetLogGroupResult {
  @scala.inline
  def apply(arn: String, creationTime: Double, id: String, name: String): GetLogGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, creationTime = creationTime, id = id, name = name)
  
    __obj.asInstanceOf[GetLogGroupResult]
  }
}

