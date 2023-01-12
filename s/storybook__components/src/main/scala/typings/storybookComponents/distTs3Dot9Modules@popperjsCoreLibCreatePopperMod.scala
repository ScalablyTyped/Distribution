package typings.storybookComponents

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Instance
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Modifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.OptionsGeneric
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.SideObject
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.State
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.VirtualElement
import typings.storybookComponents.anon.PartialModifieranyany
import typings.storybookComponents.anon.PartialOptions
import typings.storybookComponents.anon.PartialOptionsGenericany
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@popperjsCoreLibCreatePopperMod` {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-createPopper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
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
  
  trait PopperGeneratorArgs extends StObject {
    
    var defaultModifiers: js.UndefOr[js.Array[Modifier[Any, Any]]] = js.undefined
    
    var defaultOptions: js.UndefOr[PartialOptionsGenericany] = js.undefined
  }
  object PopperGeneratorArgs {
    
    inline def apply(): PopperGeneratorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperGeneratorArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperGeneratorArgs] (val x: Self) extends AnyVal {
      
      inline def setDefaultModifiers(value: js.Array[Modifier[Any, Any]]): Self = StObject.set(x, "defaultModifiers", value.asInstanceOf[js.Any])
      
      inline def setDefaultModifiersUndefined: Self = StObject.set(x, "defaultModifiers", js.undefined)
      
      inline def setDefaultModifiersVarargs(value: (Modifier[Any, Any])*): Self = StObject.set(x, "defaultModifiers", js.Array(value*))
      
      inline def setDefaultOptions(value: PartialOptionsGenericany): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    }
  }
}
