package typings.reactElemental.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelValue extends js.Object {
  val label: String | ReactNode
  val value: String
}

object LabelValue {
  @scala.inline
  def apply(value: String, label: String | ReactNode = null): LabelValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelValue]
  }
}

