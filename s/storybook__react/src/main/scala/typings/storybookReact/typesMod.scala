package typings.storybookReact

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait IStorybookSection extends StObject {
    
    var kind: String
    
    var stories: js.Array[IStorybookStory]
  }
  object IStorybookSection {
    
    @scala.inline
    def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStorybookSection]
    }
    
    @scala.inline
    implicit class IStorybookSectionMutableBuilder[Self <: IStorybookSection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStories(value: js.Array[IStorybookStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesVarargs(value: IStorybookStory*): Self = StObject.set(x, "stories", js.Array(value :_*))
    }
  }
  
  trait IStorybookStory extends StObject {
    
    var name: String
    
    def render(): js.Any
  }
  object IStorybookStory {
    
    @scala.inline
    def apply(name: String, render: () => js.Any): IStorybookStory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IStorybookStory]
    }
    
    @scala.inline
    implicit class IStorybookStoryMutableBuilder[Self <: IStorybookStory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  trait ShowErrorArgs extends StObject {
    
    var description: String
    
    var title: String
  }
  object ShowErrorArgs {
    
    @scala.inline
    def apply(description: String, title: String): ShowErrorArgs = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowErrorArgs]
    }
    
    @scala.inline
    implicit class ShowErrorArgsMutableBuilder[Self <: ShowErrorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryFnReactReturnType = ReactElement
}
