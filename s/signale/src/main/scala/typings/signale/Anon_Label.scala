package typings.signale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: String
  var span: js.UndefOr[Double] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: String, span: Int | Double = null): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

