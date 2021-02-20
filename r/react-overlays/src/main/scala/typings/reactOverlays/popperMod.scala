package typings.reactOverlays

import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.Instance
import typings.popperjsCore.typesMod.OptionsGeneric
import typings.popperjsCore.typesMod.VirtualElement
import typings.reactOverlays.anon.PartialModifieranyany
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperMod {
  
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("react-overlays/cjs/popper", "placements")
  @js.native
  val placements: js.Array[Placement] = js.native
}
