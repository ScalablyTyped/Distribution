package typings.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl>> */
trait PartialPickImplkeyofImplHide extends js.Object {
  var hide: js.UndefOr[Double] = js.undefined
  var search: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
  var touch: js.UndefOr[Double] = js.undefined
}

object PartialPickImplkeyofImplHide {
  @scala.inline
  def apply(
    hide: Int | Double = null,
    search: Int | Double = null,
    show: Int | Double = null,
    touch: Int | Double = null
  ): PartialPickImplkeyofImplHide = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplHide]
  }
}

