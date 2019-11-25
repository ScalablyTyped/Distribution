package typings.smartwizard.JQuerySmartwizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lang extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
}

object Lang {
  @scala.inline
  def apply(next: String = null, previous: String = null): Lang = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
}

