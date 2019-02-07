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

