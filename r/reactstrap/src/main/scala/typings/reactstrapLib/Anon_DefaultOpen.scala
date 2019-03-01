package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultOpen extends js.Object {
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DefaultOpen {
  @scala.inline
  def apply(defaultOpen: js.UndefOr[scala.Boolean] = js.undefined): Anon_DefaultOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    __obj.asInstanceOf[Anon_DefaultOpen]
  }
}

