package typings.rdflib.fetcherMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var panes: js.UndefOr[js.Any] = js.undefined
}

object Window {
  @scala.inline
  def apply(panes: js.Any = null): Window = {
    val __obj = js.Dynamic.literal()
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

