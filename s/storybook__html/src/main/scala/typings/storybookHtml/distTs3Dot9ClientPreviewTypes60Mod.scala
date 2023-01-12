package typings.storybookHtml

import typings.std.HTMLElement
import typings.storybookHtml.distTs3Dot9ClientPreviewTypesMod.StoryFnHtmlReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewTypes60Mod {
  
  trait HtmlFramework extends StObject {
    
    var component: HTMLElement
    
    var storyResult: StoryFnHtmlReturnType
  }
  object HtmlFramework {
    
    inline def apply(component: HTMLElement, storyResult: StoryFnHtmlReturnType): HtmlFramework = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], storyResult = storyResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlFramework]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlFramework] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: HTMLElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setStoryResult(value: StoryFnHtmlReturnType): Self = StObject.set(x, "storyResult", value.asInstanceOf[js.Any])
    }
  }
  
  type Meta[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<HtmlFramework, TArgs> */ Any
  
  type Story[TArgs] = StoryFn[TArgs]
  
  type StoryFn[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<HtmlFramework, TArgs> */ Any
  
  type StoryObj[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<HtmlFramework, TArgs> */ Any
}
