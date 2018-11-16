package typings
package reactDashMdLib.libDrawersDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SharedDrawerProps
  extends reactDashMdLib.libMod.Props {
  var autoclose: js.UndefOr[scala.Boolean] = js.undefined
  var autocloseAfterInk: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var clickableDesktopOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var defaultMedia: js.UndefOr[MediaType] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var navClassName: js.UndefOr[java.lang.String] = js.undefined
  var navItems: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactElement[_] | NavItem]] = js.undefined
  var navItemsId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var navStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onMediaTypeChange: js.UndefOr[
    js.Function2[/* type */ DrawerType, /* media */ reactDashMdLib.Anon_Desktop, scala.Unit]
  ] = js.undefined
  var onVisibilityChange: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var overlay: js.UndefOr[scala.Boolean] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var portal: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[DrawerPosition] = js.undefined
  var renderNode: js.UndefOr[js.Object] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

