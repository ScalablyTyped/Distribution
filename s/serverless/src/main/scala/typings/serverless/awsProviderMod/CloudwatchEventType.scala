package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudwatchEventType extends js.Object {
  var detail: Detail
  var `detail-type`: js.Array[String]
  var source: js.Array[String]
}

object CloudwatchEventType {
  @scala.inline
  def apply(detail: Detail, `detail-type`: js.Array[String], source: js.Array[String]): CloudwatchEventType = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchEventType]
  }
}

