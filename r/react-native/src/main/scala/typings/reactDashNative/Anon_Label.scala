package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var name: String
}

object Anon_Label {
  @scala.inline
  def apply(name: String, label: String = null): Anon_Label = {
    val __obj = js.Dynamic.literal(name = name)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Label]
  }
}

