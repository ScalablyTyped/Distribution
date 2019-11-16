package typings.reactDashCollapse.reactDashCollapseMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactNode
import typings.reactDashCollapse.Anon_Collapse
import typings.reactDashCollapse.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends AllHTMLAttributes[Collapse]
     with ClassAttributes[Collapse] {
  /** How often (in ms) the height of the content is checked. */
  var checkTimeout: js.UndefOr[Double] = js.undefined
  /** One or multiple children with static, variable or dynamic height. */
  @JSName("children")
  var children_CollapseProps: ReactNode
  /** A way to control the initial element style. Will not be valid after the initial render */
  var initialStyle: js.UndefOr[Anon_Height] = js.undefined
  /** Expands or collapses content. */
  var isOpened: Boolean
  /** Callback function triggered when animation has completed */
  var onRest: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
  /** Callback function triggered when animation begins */
  var onWork: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
  /** It is possible to set className for extra div elements that ReactCollapse creates. */
  var theme: js.UndefOr[Anon_Collapse] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    isOpened: Boolean,
    AllHTMLAttributes: AllHTMLAttributes[Collapse] = null,
    ClassAttributes: ClassAttributes[Collapse] = null,
    checkTimeout: Int | Double = null,
    children: ReactNode = null,
    initialStyle: Anon_Height = null,
    onRest: /* args */ CollapseCallbackArgs => Unit = null,
    onWork: /* args */ CollapseCallbackArgs => Unit = null,
    theme: Anon_Collapse = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal(isOpened = isOpened)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (checkTimeout != null) __obj.updateDynamic("checkTimeout")(checkTimeout.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialStyle != null) __obj.updateDynamic("initialStyle")(initialStyle)
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction1(onRest))
    if (onWork != null) __obj.updateDynamic("onWork")(js.Any.fromFunction1(onWork))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CollapseProps]
  }
}

