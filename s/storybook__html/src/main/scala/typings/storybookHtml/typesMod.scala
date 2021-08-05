package typings.storybookHtml

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait IStorybookSection extends StObject {
    
    var kind: String
    
    var stories: js.Array[IStorybookStory]
  }
  object IStorybookSection {
    
    inline def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStorybookSection]
    }
    
    extension [Self <: IStorybookSection](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setStories(value: js.Array[IStorybookStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setStoriesVarargs(value: IStorybookStory*): Self = StObject.set(x, "stories", js.Array(value :_*))
    }
  }
  
  trait IStorybookStory extends StObject {
    
    var name: String
    
    def render(): js.Any
  }
  object IStorybookStory {
    
    inline def apply(name: String, render: () => js.Any): IStorybookStory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IStorybookStory]
    }
    
    extension [Self <: IStorybookStory](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  trait ShowErrorArgs extends StObject {
    
    var description: String
    
    var title: String
  }
  object ShowErrorArgs {
    
    inline def apply(description: String, title: String): ShowErrorArgs = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowErrorArgs]
    }
    
    extension [Self <: ShowErrorArgs](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryFnHtmlReturnType = String | Node
}
