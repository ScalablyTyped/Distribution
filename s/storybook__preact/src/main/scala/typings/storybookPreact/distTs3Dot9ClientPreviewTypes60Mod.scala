package typings.storybookPreact

import typings.preact.mod.AnyComponent
import typings.storybookPreact.distTs3Dot9ClientPreviewTypesMod.StoryFnPreactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewTypes60Mod {
  
  type Meta[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<PreactFramework, TArgs> */ Any
  
  trait PreactFramework extends StObject {
    
    var component: AnyComponent[Any, Any]
    
    var storyResult: StoryFnPreactReturnType
  }
  object PreactFramework {
    
    inline def apply(component: AnyComponent[Any, Any], storyResult: StoryFnPreactReturnType): PreactFramework = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], storyResult = storyResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreactFramework]
    }
    
    extension [Self <: PreactFramework](x: Self) {
      
      inline def setComponent(value: AnyComponent[Any, Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setStoryResult(value: StoryFnPreactReturnType): Self = StObject.set(x, "storyResult", value.asInstanceOf[js.Any])
    }
  }
  
  type Story[TArgs] = StoryFn[TArgs]
  
  type StoryFn[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<PreactFramework, TArgs> */ Any
  
  type StoryObj[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<PreactFramework, TArgs> */ Any
}
