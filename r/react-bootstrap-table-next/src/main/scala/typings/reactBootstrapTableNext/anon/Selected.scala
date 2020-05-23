package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selected extends js.Object {
  var selected: js.UndefOr[js.Array[_]] = js.undefined
}

object Selected {
  @scala.inline
  def apply(selected: js.Array[_] = null): Selected = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
}

