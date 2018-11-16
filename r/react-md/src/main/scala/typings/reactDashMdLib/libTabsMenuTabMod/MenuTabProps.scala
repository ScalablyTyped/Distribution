package typings
package reactDashMdLib.libTabsMenuTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MenuTabProps
  extends reactDashMdLib.libMod.Props {
  var activeTabIndex: scala.Double
  var id: reactDashMdLib.libMod.IdPropType
  var label: reactLib.reactMod.ReactNs.ReactNode
  var overflowAtIndex: scala.Double
  var tabClassName: js.UndefOr[java.lang.String] = js.undefined
  var tabStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabs: js.Array[
    reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabMod.TabProps] | java.lang.String | reactDashMdLib.Anon_Subheader
  ]
}

