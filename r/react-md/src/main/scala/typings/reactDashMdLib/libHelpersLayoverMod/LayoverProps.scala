package typings
package reactDashMdLib.libHelpersLayoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoverProps
  extends SharedLayoverProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animationPosition: js.UndefOr[LayoverPositions | java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var onClose: js.Function
  var onContextMenu: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var preventContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  var simplified: js.UndefOr[scala.Boolean] = js.undefined
  var toggle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var toggleQuery: js.UndefOr[java.lang.String | js.Object | toggleQueryFn] = js.undefined
  var visible: scala.Boolean
}

