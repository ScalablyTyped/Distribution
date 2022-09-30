package typings.storybookReact

import typings.react.mod.ComponentType
import typings.storybookReact.previewTypesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types60Mod {
  
  type Meta[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<ReactFramework, TArgs> */ Any
  
  trait ReactFramework extends StObject {
    
    var component: ComponentType[Any]
    
    var storyResult: StoryFnReactReturnType
  }
  object ReactFramework {
    
    inline def apply(component: ComponentType[Any], storyResult: StoryFnReactReturnType): ReactFramework = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], storyResult = storyResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFramework]
    }
    
    extension [Self <: ReactFramework](x: Self) {
      
      inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setStoryResult(value: StoryFnReactReturnType): Self = StObject.set(x, "storyResult", value.asInstanceOf[js.Any])
    }
  }
  
  type Story[TArgs] = StoryFn[TArgs]
  
  type StoryFn[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<ReactFramework, TArgs> */ Any
  
  type StoryObj[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<ReactFramework, TArgs> */ Any
}
