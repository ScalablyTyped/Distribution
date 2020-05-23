package typings.signale.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: String
  var span: js.UndefOr[Double] = js.undefined
}

object Label {
  @scala.inline
  def apply(label: String, span: js.UndefOr[Double] = js.undefined): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(span)) __obj.updateDynamic("span")(span.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

