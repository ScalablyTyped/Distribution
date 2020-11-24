package typings.reactOverlays.esmUsePopperMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/esm/usePopper", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Position an element relative some reference element using Popper.js
    *
    * @param referenceElement
    * @param popperElement
    * @param {object}      options
    * @param {object=}     options.modifiers Popper.js modifiers
    * @param {boolean=}    options.enabled toggle the popper functionality on/off
    * @param {string=}     options.placement The popper element placement relative to the reference element
    * @param {string=}     options.strategy the positioning strategy
    * @param {boolean=}    options.eventsEnabled have Popper listen on window resize events to reposition the element
    * @param {function=}   options.onCreate called when the popper is created
    * @param {function=}   options.onUpdate called when the popper is updated
    *
    * @returns {UsePopperState} The popper state
    */
  def apply(): UsePopperState = js.native
  def apply(
    referenceElement: js.UndefOr[scala.Nothing],
    popperElement: js.UndefOr[scala.Nothing],
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(
    referenceElement: js.UndefOr[scala.Nothing],
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(referenceElement: js.UndefOr[scala.Nothing], popperElement: HTMLElement): UsePopperState = js.native
  def apply(
    referenceElement: js.UndefOr[scala.Nothing],
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(
    referenceElement: Null,
    popperElement: js.UndefOr[scala.Nothing],
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(
    referenceElement: Null,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(referenceElement: Null, popperElement: HTMLElement): UsePopperState = js.native
  def apply(
    referenceElement: Null,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(referenceElement: VirtualElement): UsePopperState = js.native
  def apply(
    referenceElement: VirtualElement,
    popperElement: js.UndefOr[scala.Nothing],
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(
    referenceElement: VirtualElement,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
  def apply(referenceElement: VirtualElement, popperElement: HTMLElement): UsePopperState = js.native
  def apply(
    referenceElement: VirtualElement,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = js.native
}
