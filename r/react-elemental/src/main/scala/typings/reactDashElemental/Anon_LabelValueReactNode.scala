package typings.reactDashElemental

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelValueReactNode extends js.Object {
  val label: String | ReactNode
  val value: String
}

object Anon_LabelValueReactNode {
  @scala.inline
  def apply(value: String, label: String | ReactNode = null): Anon_LabelValueReactNode = {
    val __obj = js.Dynamic.literal(value = value)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LabelValueReactNode]
  }
}

