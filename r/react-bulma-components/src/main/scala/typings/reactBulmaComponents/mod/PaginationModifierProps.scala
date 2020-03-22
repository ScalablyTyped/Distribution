package typings.reactBulmaComponents.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ReactNode
import typings.reactBulmaComponents.reactBulmaComponentsStrings.nav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Pagination ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/pagination/pagination.js
trait PaginationModifierProps extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.undefined
  // todo: https://github.com/couds/react-bulma-components/issues/110
  var current: js.UndefOr[Double] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var next: js.UndefOr[ReactNode] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[nav]] = js.undefined
  var previous: js.UndefOr[ReactNode] = js.undefined
  var showPrevNext: js.UndefOr[Boolean] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object PaginationModifierProps {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    current: Int | Double = null,
    delta: Int | Double = null,
    next: ReactNode = null,
    onChange: ChangeEvent[nav] => Unit = null,
    previous: ReactNode = null,
    showPrevNext: js.UndefOr[Boolean] = js.undefined,
    total: Int | Double = null
  ): PaginationModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrevNext)) __obj.updateDynamic("showPrevNext")(showPrevNext.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationModifierProps]
  }
}

