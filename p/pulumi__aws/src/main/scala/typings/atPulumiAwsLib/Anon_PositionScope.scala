package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionScope extends js.Object {
  var position: scala.Double
  var scope: java.lang.String
  var topicArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PositionScope {
  @scala.inline
  def apply(position: scala.Double, scope: java.lang.String, topicArn: java.lang.String = null): Anon_PositionScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("scope")(scope)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_PositionScope]
  }
}

