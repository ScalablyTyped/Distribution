package typings.reactCollapse.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.reactCollapse.anon.Height
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
  var initialStyle: js.UndefOr[Height] = js.undefined
  /** Expands or collapses content. */
  var isOpened: Boolean
  /** Callback function triggered when animation has completed */
  var onRest: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
  /** Callback function triggered when animation begins */
  var onWork: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.undefined
  /** It is possible to set className for extra div elements that ReactCollapse creates. */
  var theme: js.UndefOr[typings.reactCollapse.anon.Collapse] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    isOpened: Boolean,
    AllHTMLAttributes: AllHTMLAttributes[Collapse] = null,
    ClassAttributes: ClassAttributes[Collapse] = null,
    checkTimeout: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    initialStyle: Height = null,
    onRest: /* args */ CollapseCallbackArgs => Unit = null,
    onWork: /* args */ CollapseCallbackArgs => Unit = null,
    theme: typings.reactCollapse.anon.Collapse = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(checkTimeout)) __obj.updateDynamic("checkTimeout")(checkTimeout.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialStyle != null) __obj.updateDynamic("initialStyle")(initialStyle.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction1(onRest))
    if (onWork != null) __obj.updateDynamic("onWork")(js.Any.fromFunction1(onWork))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

