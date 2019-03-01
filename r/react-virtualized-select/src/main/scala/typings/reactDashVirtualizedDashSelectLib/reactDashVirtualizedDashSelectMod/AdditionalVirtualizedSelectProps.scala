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

object AdditionalVirtualizedSelectProps {
  @scala.inline
  def apply[TValue](
    maxHeight: scala.Int | scala.Double = null,
    optionHeight: scala.Int | scala.Double = null,
    optionRenderer: js.Function1[
      /* options */ VirtualizedOptionRenderOptions[TValue], 
      reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    selectComponent: (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null
  ): AdditionalVirtualizedSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (optionHeight != null) __obj.updateDynamic("optionHeight")(optionHeight.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(optionRenderer)
    if (selectComponent != null) __obj.updateDynamic("selectComponent")(selectComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
  }
}

