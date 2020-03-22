package typings.pulumiAws.outputMod.cloudtrail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailEventSelectorDataResource extends js.Object {
  /**
    * The resource type in which you want to log data events. You can specify only the following value: "AWS::S3::Object", "AWS::Lambda::Function"
    */
  var `type`: String = js.native
  /**
    * A list of ARN for the specified S3 buckets and object prefixes..
    */
  var values: js.Array[String] = js.native
}

object TrailEventSelectorDataResource {
  @scala.inline
  def apply(`type`: String, values: js.Array[String]): TrailEventSelectorDataResource = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailEventSelectorDataResource]
  }
}

