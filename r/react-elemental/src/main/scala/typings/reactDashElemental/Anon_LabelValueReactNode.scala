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
  def apply(label: String | ReactNode, value: String): Anon_LabelValueReactNode = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Anon_LabelValueReactNode]
  }
}

