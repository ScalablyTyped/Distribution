package typings.storybookComponents

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibCreatePopperMod`.PopperGeneratorArgs
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibModifiersApplyStylesMod`.ApplyStylesModifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibModifiersComputeStylesMod`.ComputeStylesModifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibModifiersEventListenersMod`.EventListenersModifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibModifiersPopperOffsetsMod`.PopperOffsetsModifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Instance
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.OptionsGeneric
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.SideObject
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.State
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.VirtualElement
import typings.storybookComponents.anon.PartialModifieranyany
import typings.storybookComponents.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@popperjsCoreLibPopperLiteMod` {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-popper-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-popper-lite", "defaultModifiers")
  @js.native
  val defaultModifiers: js.Array[
    PopperOffsetsModifier | EventListenersModifier | ComputeStylesModifier | ApplyStylesModifier
  ] = js.native
  
  inline def detectOverflow(state: State): SideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any]).asInstanceOf[SideObject]
  inline def detectOverflow(state: State, options: PartialOptions): SideObject = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideObject]
  
  inline def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("popperGenerator")().asInstanceOf[js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ]]
  inline def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("popperGenerator")(generatorOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ]]
}
