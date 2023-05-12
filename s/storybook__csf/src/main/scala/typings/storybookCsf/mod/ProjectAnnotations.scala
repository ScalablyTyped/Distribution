package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectAnnotations[TRenderer /* <: Renderer */, TArgs]
  extends StObject
     with BaseAnnotations[TRenderer, TArgs] {
  
  var applyDecorators: js.UndefOr[DecoratorApplicator[TRenderer, Args]] = js.undefined
  
  var argTypesEnhancers: js.UndefOr[js.Array[ArgTypesEnhancer[TRenderer, Args]]] = js.undefined
  
  var argsEnhancers: js.UndefOr[js.Array[ArgsEnhancer[TRenderer, Args]]] = js.undefined
  
  var globalTypes: js.UndefOr[GlobalTypes] = js.undefined
  
  var globals: js.UndefOr[Globals] = js.undefined
  
  var runStep: js.UndefOr[StepRunner[TRenderer, TArgs]] = js.undefined
}
object ProjectAnnotations {
  
  inline def apply[TRenderer /* <: Renderer */, TArgs](): ProjectAnnotations[TRenderer, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectAnnotations[TRenderer, TArgs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectAnnotations[?, ?], TRenderer /* <: Renderer */, TArgs] (val x: Self & (ProjectAnnotations[TRenderer, TArgs])) extends AnyVal {
    
    inline def setApplyDecorators(
      value: (/* storyFn */ LegacyStoryFn[TRenderer, Args], /* decorators */ js.Array[DecoratorFunction[TRenderer, Args]]) => LegacyStoryFn[TRenderer, Args]
    ): Self = StObject.set(x, "applyDecorators", js.Any.fromFunction2(value))
    
    inline def setApplyDecoratorsUndefined: Self = StObject.set(x, "applyDecorators", js.undefined)
    
    inline def setArgTypesEnhancers(value: js.Array[ArgTypesEnhancer[TRenderer, Args]]): Self = StObject.set(x, "argTypesEnhancers", value.asInstanceOf[js.Any])
    
    inline def setArgTypesEnhancersUndefined: Self = StObject.set(x, "argTypesEnhancers", js.undefined)
    
    inline def setArgTypesEnhancersVarargs(value: (ArgTypesEnhancer[TRenderer, Args])*): Self = StObject.set(x, "argTypesEnhancers", js.Array(value*))
    
    inline def setArgsEnhancers(value: js.Array[ArgsEnhancer[TRenderer, Args]]): Self = StObject.set(x, "argsEnhancers", value.asInstanceOf[js.Any])
    
    inline def setArgsEnhancersUndefined: Self = StObject.set(x, "argsEnhancers", js.undefined)
    
    inline def setArgsEnhancersVarargs(value: (ArgsEnhancer[TRenderer, Args])*): Self = StObject.set(x, "argsEnhancers", js.Array(value*))
    
    inline def setGlobalTypes(value: GlobalTypes): Self = StObject.set(x, "globalTypes", value.asInstanceOf[js.Any])
    
    inline def setGlobalTypesUndefined: Self = StObject.set(x, "globalTypes", js.undefined)
    
    inline def setGlobals(value: Globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setRunStep(
      value: (/* label */ StepLabel, /* play */ PlayFunction[TRenderer, TArgs], /* context */ PlayFunctionContext[TRenderer, TArgs]) => js.Promise[Unit]
    ): Self = StObject.set(x, "runStep", js.Any.fromFunction3(value))
    
    inline def setRunStepUndefined: Self = StObject.set(x, "runStep", js.undefined)
  }
}
