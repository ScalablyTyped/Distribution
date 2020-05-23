package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expanded extends js.Object {
  var expanded: js.UndefOr[js.Array[_]] = js.undefined
}

object Expanded {
  @scala.inline
  def apply(expanded: js.Array[_] = null): Expanded = {
    val __obj = js.Dynamic.literal()
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
}

