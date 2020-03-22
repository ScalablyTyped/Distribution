package typings.reactElemental

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelValue extends js.Object {
  val label: String | ReactNode
  val value: String
}

object AnonLabelValue {
  @scala.inline
  def apply(value: String, label: String | ReactNode = null): AnonLabelValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelValue]
  }
}

