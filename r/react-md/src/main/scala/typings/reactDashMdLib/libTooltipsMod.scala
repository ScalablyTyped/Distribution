package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-md/lib/Tooltips", JSImport.Namespace)
@js.native
object libTooltipsMod extends js.Object {
  val Tooltipped: reactLib.reactMod.ReactNs.ComponentClass[
    reactDashMdLib.libTooltipsTooltippedMod.TooltippedProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def default[ComposedProps](
    ComposedComponent: reactLib.reactMod.ReactNs.ComponentType[ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.TooltipProps]
  ): (reactLib.reactMod.ReactNs.ComponentClass[
    ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashMdLib.libTooltipsInjectTooltipMod.TooltippedComponent = js.native
  def injectTooltip[ComposedProps](
    ComposedComponent: reactLib.reactMod.ReactNs.ComponentType[ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.TooltipProps]
  ): (reactLib.reactMod.ReactNs.ComponentClass[
    ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashMdLib.libTooltipsInjectTooltipMod.TooltippedComponent = js.native
}

