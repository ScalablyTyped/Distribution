package typings.storybookUi.sidebarItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentProps<'span'> & {  isExpanded ? :boolean,   isExpandable ? :boolean} */
trait ExpanderProps extends js.Object {
  var isExpandable: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}

object ExpanderProps {
  @scala.inline
  def apply(isExpandable: js.UndefOr[Boolean] = js.undefined, isExpanded: js.UndefOr[Boolean] = js.undefined): ExpanderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpandable)) __obj.updateDynamic("isExpandable")(isExpandable.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpanderProps]
  }
}

