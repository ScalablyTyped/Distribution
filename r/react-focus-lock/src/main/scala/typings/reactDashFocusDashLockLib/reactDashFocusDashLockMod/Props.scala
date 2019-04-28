package typings
package reactDashFocusDashLockLib.reactDashFocusDashLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * @deprecated Use persistentFocus=false instead
    * enables(or disables) text selection. This also allows not to have ANY focus.
    */
  var allowTextSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Component to use, defaults to 'div'
    */
  var as: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  /**
    * enables or disables autoFocusing feature.
    * If enabled - will move focus inside Lock, selecting the first or autoFocusable element
    * If disable - will blur any focus on Lock activation.
    * @default true
    */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * named focus group for focus scattering aka combined lock targets
    */
  var group: js.UndefOr[java.lang.String] = js.undefined
  var lockProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * disables hidden inputs before and after the lock.
    */
  var noFocusGuards: js.UndefOr[scala.Boolean | reactDashFocusDashLockLib.reactDashFocusDashLockLibStrings.tail] = js.undefined
  /**
    * life-cycle hook, called on lock activation
    * @param node the observed node
    */
  var onActivation: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  /**
    * life-cycle hook, called on deactivation
    * @param node the observed node
    */
  var onDeactivation: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  /**
    * enables of disables "sticky" behavior, when any focusable element shall be focused.
    * This disallow any text selection on the page.
    * @default false
    */
  var persistentFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * will return focus to the previous position on trap disable.
    */
  var returnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shards forms a scattered lock, same as `group` does, but in more "low" and controlled way
    */
  var shards: js.UndefOr[js.Array[reactLib.reactMod.RefObject[_] | stdLib.HTMLElement]] = js.undefined
  /**
    * Controls focus lock working areas. Lock will silently ignore all the events from `not allowed` areas
    * @param activeElement
    * @returns {Boolean} true if focus lock should handle activeElement, false if not
    */
  var whiteList: js.UndefOr[js.Function1[/* activeElement */ stdLib.HTMLElement, scala.Boolean]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    allowTextSelection: js.UndefOr[scala.Boolean] = js.undefined,
    as: reactLib.reactMod.ReactType[_] = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String = null,
    lockProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    noFocusGuards: scala.Boolean | reactDashFocusDashLockLib.reactDashFocusDashLockLibStrings.tail = null,
    onActivation: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onDeactivation: /* node */ stdLib.HTMLElement => scala.Unit = null,
    persistentFocus: js.UndefOr[scala.Boolean] = js.undefined,
    returnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    shards: js.Array[reactLib.reactMod.RefObject[_] | stdLib.HTMLElement] = null,
    whiteList: /* activeElement */ stdLib.HTMLElement => scala.Boolean = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTextSelection)) __obj.updateDynamic("allowTextSelection")(allowTextSelection)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (group != null) __obj.updateDynamic("group")(group)
    if (lockProps != null) __obj.updateDynamic("lockProps")(lockProps)
    if (noFocusGuards != null) __obj.updateDynamic("noFocusGuards")(noFocusGuards.asInstanceOf[js.Any])
    if (onActivation != null) __obj.updateDynamic("onActivation")(js.Any.fromFunction1(onActivation))
    if (onDeactivation != null) __obj.updateDynamic("onDeactivation")(js.Any.fromFunction1(onDeactivation))
    if (!js.isUndefined(persistentFocus)) __obj.updateDynamic("persistentFocus")(persistentFocus)
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus)
    if (shards != null) __obj.updateDynamic("shards")(shards)
    if (whiteList != null) __obj.updateDynamic("whiteList")(js.Any.fromFunction1(whiteList))
    __obj.asInstanceOf[Props]
  }
}

