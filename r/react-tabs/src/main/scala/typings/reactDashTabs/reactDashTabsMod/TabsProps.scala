package typings.reactDashTabs.reactDashTabsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLDivElement>, 'className' | 'onSelect'> ]: react.react.HTMLProps<std.HTMLDivElement>[P]} */ trait TabsProps extends js.Object {
  var className: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
  var defaultFocus: js.UndefOr[Boolean] = js.undefined
  var defaultIndex: js.UndefOr[Double] = js.undefined
  var disabledTabClassName: js.UndefOr[String] = js.undefined
  var domRef: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  var forceRenderTabPanel: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[
    js.Function3[/* index */ Double, /* last */ Double, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var selectedTabClassName: js.UndefOr[String] = js.undefined
  var selectedTabPanelClassName: js.UndefOr[String] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    className: String | js.Array[String] | StringDictionary[Boolean] = null,
    defaultFocus: js.UndefOr[Boolean] = js.undefined,
    defaultIndex: Int | Double = null,
    disabledTabClassName: String = null,
    domRef: /* node */ js.UndefOr[HTMLElement] => Unit = null,
    forceRenderTabPanel: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* index */ Double, /* last */ Double, /* event */ Event) => Boolean | Unit = null,
    selectedIndex: Int | Double = null,
    selectedTabClassName: String = null,
    selectedTabPanelClassName: String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFocus)) __obj.updateDynamic("defaultFocus")(defaultFocus.asInstanceOf[js.Any])
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (disabledTabClassName != null) __obj.updateDynamic("disabledTabClassName")(disabledTabClassName.asInstanceOf[js.Any])
    if (domRef != null) __obj.updateDynamic("domRef")(js.Any.fromFunction1(domRef))
    if (!js.isUndefined(forceRenderTabPanel)) __obj.updateDynamic("forceRenderTabPanel")(forceRenderTabPanel.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3(onSelect))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedTabClassName != null) __obj.updateDynamic("selectedTabClassName")(selectedTabClassName.asInstanceOf[js.Any])
    if (selectedTabPanelClassName != null) __obj.updateDynamic("selectedTabPanelClassName")(selectedTabPanelClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

