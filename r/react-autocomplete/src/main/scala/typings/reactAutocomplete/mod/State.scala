package typings.reactAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /**
    * Index of the highlighted item, `null` if none currently is.
    */
  var highlightedIndex: Double | Null
  /**
    * True when the menu is visible. Provided to `onMenuVisibilityChange`.
    */
  var isOpen: Boolean
  /**
    * These three `menu___` values are used in CSS to layout the menu.
    */
  var menuLeft: js.UndefOr[Double] = js.undefined
  var menuTop: js.UndefOr[Double] = js.undefined
  var menuWidth: js.UndefOr[Double] = js.undefined
}

object State {
  @scala.inline
  def apply(
    isOpen: Boolean,
    highlightedIndex: Double = null.asInstanceOf[Double],
    menuLeft: js.UndefOr[Double] = js.undefined,
    menuTop: js.UndefOr[Double] = js.undefined,
    menuWidth: js.UndefOr[Double] = js.undefined
  ): State = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], highlightedIndex = highlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(menuLeft)) __obj.updateDynamic("menuLeft")(menuLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(menuTop)) __obj.updateDynamic("menuTop")(menuTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(menuWidth)) __obj.updateDynamic("menuWidth")(menuWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

