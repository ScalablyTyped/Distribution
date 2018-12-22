package typings
package reactDashMdLib.libBottomNavigationsBottomNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BottomNavigationProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultActiveIndex: js.UndefOr[scala.Double] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  var dynamicThreshold: js.UndefOr[scala.Double] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var links: js.Array[reactDashMdLib.Anon_KeyIconClassName]
  var onNavChange: js.UndefOr[
    js.Function2[
      /* activeIndex */ scala.Double, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onVisibilityChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var portal: js.UndefOr[scala.Boolean] = js.undefined
  var renderNode: js.UndefOr[js.Object] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

