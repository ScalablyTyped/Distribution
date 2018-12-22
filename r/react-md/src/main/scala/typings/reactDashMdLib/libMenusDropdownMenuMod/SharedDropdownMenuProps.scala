package typings
package reactDashMdLib.libMenusDropdownMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SharedDropdownMenuProps
  extends reactDashMdLib.libMenusMenuMod.BaseMenuProps {
  var cascading: js.UndefOr[scala.Boolean] = js.undefined
  var cascadingAnchor: js.UndefOr[reactDashMdLib.Anon_Y] = js.undefined
  var cascadingZDepth: js.UndefOr[scala.Double] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var menuItems: js.UndefOr[
    scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactNode | (js.Array[
      scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactNs.ReactNode
    ])
  ] = js.undefined
  var onVisibilityChange: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var position: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

