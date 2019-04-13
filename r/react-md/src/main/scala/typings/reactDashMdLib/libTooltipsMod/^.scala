package typings
package reactDashMdLib.libTooltipsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-md/lib/Tooltips", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Tooltipped: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libTooltipsTooltippedMod.TooltippedProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def default[ComposedProps](
    ComposedComponent: reactLib.reactMod.ComponentType[ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.TooltipProps]
  ): (reactLib.reactMod.ComponentClass[
    ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps, 
    reactLib.reactMod.ComponentState
  ]) with reactDashMdLib.libTooltipsInjectTooltipMod.TooltippedComponent = js.native
  def injectTooltip[ComposedProps](
    ComposedComponent: reactLib.reactMod.ComponentType[ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.TooltipProps]
  ): (reactLib.reactMod.ComponentClass[
    ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps, 
    reactLib.reactMod.ComponentState
  ]) with reactDashMdLib.libTooltipsInjectTooltipMod.TooltippedComponent = js.native
}

