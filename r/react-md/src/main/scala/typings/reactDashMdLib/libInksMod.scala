package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-md/lib/Inks", JSImport.Namespace)
@js.native
object libInksMod extends js.Object {
  def default[ComposedProps](
    ComposedComponent: reactLib.reactMod.ReactNs.ComponentType[ComposedProps with reactDashMdLib.libInksInjectInkMod.InkProps]
  ): (reactLib.reactMod.ReactNs.ComponentClass[
    ComposedProps with reactDashMdLib.libInksInjectInkMod.InjectedInkProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashMdLib.libInksInjectInkMod.InkedComponent = js.native
  def injectInk[ComposedProps](
    ComposedComponent: reactLib.reactMod.ReactNs.ComponentType[ComposedProps with reactDashMdLib.libInksInjectInkMod.InkProps]
  ): (reactLib.reactMod.ReactNs.ComponentClass[
    ComposedProps with reactDashMdLib.libInksInjectInkMod.InjectedInkProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashMdLib.libInksInjectInkMod.InkedComponent = js.native
}

