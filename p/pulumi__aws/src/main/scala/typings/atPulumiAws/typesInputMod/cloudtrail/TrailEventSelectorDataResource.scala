package typings.atPulumiAws.typesInputMod.cloudtrail

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailEventSelectorDataResource extends js.Object {
  /**
    * The resource type in which you want to log data events. You can specify only the follwing value: "AWS::S3::Object", "AWS::Lambda::Function"
    */
  var `type`: Input[String] = js.native
  /**
    * A list of ARN for the specified S3 buckets and object prefixes..
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object TrailEventSelectorDataResource {
  @scala.inline
  def apply(`type`: Input[String], values: Input[js.Array[Input[String]]]): TrailEventSelectorDataResource = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailEventSelectorDataResource]
  }
}

