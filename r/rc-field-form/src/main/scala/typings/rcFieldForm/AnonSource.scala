package typings.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var source: js.UndefOr[String] = js.undefined
}

object AnonSource {
  @scala.inline
  def apply(source: String = null): AnonSource = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
}

