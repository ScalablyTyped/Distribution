package typings.reactDashCollapse.reactDashCollapseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactNode
import typings.reactDashCollapse.Anon_Collapse
import typings.reactDashCollapse.Anon_Current
import typings.reactDashCollapse.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps extends HTMLProps[Collapse] {
  @JSName("children")
  var children_CollapseProps: ReactNode
  var fixedHeight: js.UndefOr[Double] = js.undefined
   // react-motion doesn't export the config interface
  var forceInitialAnimation: js.UndefOr[Boolean] = js.undefined
  var hasNestedCollapse: js.UndefOr[Boolean] = js.undefined
  var isOpened: Boolean
  var onMeasure: js.UndefOr[js.Function1[/* hasWidthHeight */ Anon_Height, Unit]] = js.undefined
  var onRender: js.UndefOr[js.Function1[/* hasCurrentFromTo */ Anon_Current, Unit]] = js.undefined
  var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
  var springConfig: js.UndefOr[StringDictionary[Double]] = js.undefined
  var theme: js.UndefOr[Anon_Collapse] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    isOpened: Boolean,
    HTMLProps: HTMLProps[Collapse] = null,
    children: ReactNode = null,
    fixedHeight: Int | Double = null,
    forceInitialAnimation: js.UndefOr[Boolean] = js.undefined,
    hasNestedCollapse: js.UndefOr[Boolean] = js.undefined,
    onMeasure: /* hasWidthHeight */ Anon_Height => Unit = null,
    onRender: /* hasCurrentFromTo */ Anon_Current => Unit = null,
    onRest: () => Unit = null,
    springConfig: StringDictionary[Double] = null,
    style: CSSProperties = null,
    theme: Anon_Collapse = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal(isOpened = isOpened)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fixedHeight != null) __obj.updateDynamic("fixedHeight")(fixedHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(forceInitialAnimation)) __obj.updateDynamic("forceInitialAnimation")(forceInitialAnimation)
    if (!js.isUndefined(hasNestedCollapse)) __obj.updateDynamic("hasNestedCollapse")(hasNestedCollapse)
    if (onMeasure != null) __obj.updateDynamic("onMeasure")(js.Any.fromFunction1(onMeasure))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction1(onRender))
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CollapseProps]
  }
}

