package typings
package reactDashVirtualizedDashSelectLib.reactDashVirtualizedDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalVirtualizedSelectProps[TValue] extends js.Object {
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var optionHeight: js.UndefOr[scala.Double] = js.undefined
  var optionRenderer: js.UndefOr[
    js.Function1[
      /* options */ VirtualizedOptionRenderOptions[TValue], 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var selectComponent: js.UndefOr[
    (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
}

