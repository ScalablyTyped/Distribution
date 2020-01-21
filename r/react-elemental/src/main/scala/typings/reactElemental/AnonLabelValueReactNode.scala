package typings.reactElemental

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelValueReactNode extends js.Object {
  val label: String | ReactNode
  val value: String
}

object AnonLabelValueReactNode {
  @scala.inline
  def apply(value: String, label: String | ReactNode = null): AnonLabelValueReactNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelValueReactNode]
  }
}

