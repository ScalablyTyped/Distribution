package typings
package reactDashTabsLib.reactDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<react.HTMLDivElement>, 'className' | 'onSelect'> ]: react.react.HTMLProps<react.HTMLDivElement>[P]} */ trait TabsProps extends js.Object {
  var className: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
  var defaultFocus: js.UndefOr[scala.Boolean] = js.undefined
  var defaultIndex: js.UndefOr[scala.Double] = js.undefined
  var disabledTabClassName: js.UndefOr[java.lang.String] = js.undefined
  var domRef: js.UndefOr[js.Function1[/* node */ js.UndefOr[reactLib.HTMLElement], scala.Unit]] = js.undefined
  var forceRenderTabPanel: js.UndefOr[scala.Boolean] = js.undefined
  var onSelect: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* last */ scala.Double, 
      /* event */ reactLib.Event, 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  var selectedTabClassName: js.UndefOr[java.lang.String] = js.undefined
  var selectedTabPanelClassName: js.UndefOr[java.lang.String] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    className: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    defaultFocus: js.UndefOr[scala.Boolean] = js.undefined,
    defaultIndex: scala.Int | scala.Double = null,
    disabledTabClassName: java.lang.String = null,
    domRef: js.Function1[/* node */ js.UndefOr[reactLib.HTMLElement], scala.Unit] = null,
    forceRenderTabPanel: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: js.Function3[
      /* index */ scala.Double, 
      /* last */ scala.Double, 
      /* event */ reactLib.Event, 
      scala.Boolean | scala.Unit
    ] = null,
    selectedIndex: scala.Int | scala.Double = null,
    selectedTabClassName: java.lang.String = null,
    selectedTabPanelClassName: java.lang.String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFocus)) __obj.updateDynamic("defaultFocus")(defaultFocus)
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (disabledTabClassName != null) __obj.updateDynamic("disabledTabClassName")(disabledTabClassName)
    if (domRef != null) __obj.updateDynamic("domRef")(domRef)
    if (!js.isUndefined(forceRenderTabPanel)) __obj.updateDynamic("forceRenderTabPanel")(forceRenderTabPanel)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedTabClassName != null) __obj.updateDynamic("selectedTabClassName")(selectedTabClassName)
    if (selectedTabPanelClassName != null) __obj.updateDynamic("selectedTabPanelClassName")(selectedTabPanelClassName)
    __obj.asInstanceOf[TabsProps]
  }
}

