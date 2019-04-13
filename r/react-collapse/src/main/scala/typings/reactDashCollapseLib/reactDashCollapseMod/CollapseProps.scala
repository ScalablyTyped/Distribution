package typings
package reactDashCollapseLib.reactDashCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends reactLib.reactMod.HTMLProps[Collapse] {
  @JSName("children")
  var children_CollapseProps: reactLib.reactMod.ReactNode
  var fixedHeight: js.UndefOr[scala.Double] = js.undefined
   // react-motion doesn't export the config interface
  var forceInitialAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var hasNestedCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var isOpened: scala.Boolean
  var onMeasure: js.UndefOr[js.Function1[/* hasWidthHeight */ reactDashCollapseLib.Anon_Height, scala.Unit]] = js.undefined
  var onRender: js.UndefOr[
    js.Function1[/* hasCurrentFromTo */ reactDashCollapseLib.Anon_Current, scala.Unit]
  ] = js.undefined
  var onRest: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var springConfig: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var theme: js.UndefOr[reactDashCollapseLib.Anon_Collapse] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    isOpened: scala.Boolean,
    HTMLProps: reactLib.reactMod.HTMLProps[Collapse] = null,
    fixedHeight: scala.Int | scala.Double = null,
    forceInitialAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    hasNestedCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    onMeasure: /* hasWidthHeight */ reactDashCollapseLib.Anon_Height => scala.Unit = null,
    onRender: /* hasCurrentFromTo */ reactDashCollapseLib.Anon_Current => scala.Unit = null,
    onRest: () => scala.Unit = null,
    springConfig: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    style: reactLib.reactMod.CSSProperties = null,
    theme: reactDashCollapseLib.Anon_Collapse = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isOpened = isOpened)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
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

