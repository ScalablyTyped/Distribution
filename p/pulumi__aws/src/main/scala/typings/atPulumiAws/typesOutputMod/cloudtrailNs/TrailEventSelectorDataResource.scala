package typings.atPulumiAws.typesOutputMod.cloudtrailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrailEventSelectorDataResource extends js.Object {
  /**
    * The resource type in which you want to log data events. You can specify only the follwing value: "AWS::S3::Object", "AWS::Lambda::Function"
    */
  var `type`: String
  /**
    * A list of ARN for the specified S3 buckets and object prefixes..
    */
  var values: js.Array[String]
}

object TrailEventSelectorDataResource {
  @scala.inline
  def apply(`type`: String, values: js.Array[String]): TrailEventSelectorDataResource = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TrailEventSelectorDataResource]
  }
}

