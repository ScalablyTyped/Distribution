package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionScope extends js.Object {
  var position: Double
  var scope: String
  var topicArn: js.UndefOr[String] = js.undefined
}

object Anon_PositionScope {
  @scala.inline
  def apply(position: Double, scope: String, topicArn: String = null): Anon_PositionScope = {
    val __obj = js.Dynamic.literal(position = position, scope = scope)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_PositionScope]
  }
}

