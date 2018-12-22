package typings
package reactDashMdLib.libDrawersDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DrawerProps
  extends SharedDrawerProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var constantType: js.UndefOr[scala.Boolean] = js.undefined
  var desktopMinWidth: js.UndefOr[scala.Double] = js.undefined
  var desktopType: js.UndefOr[DrawerType] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var mobileMinWidth: js.UndefOr[scala.Double] = js.undefined
  var mobileType: js.UndefOr[MobileDrawerType] = js.undefined
  /**
     * @deprecated
     */
  var onVisibilityToggle: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var tabletMinWidth: js.UndefOr[scala.Double] = js.undefined
  var tabletType: js.UndefOr[DrawerType] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[DrawerType] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

