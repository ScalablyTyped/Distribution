package typings.storybookComponents

import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.storybookApi.mod.Parameters
import typings.storybookComponents.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyMod {
  
  /**
    * A story element, either rendered inline or in an iframe,
    * with configurable height.
    */
  @JSImport("@storybook/components/dist/blocks/Story", "Story")
  @js.native
  val Story: FunctionComponent[StoryProps & Error] = js.native
  
  @js.native
  sealed trait StoryError extends StObject
  @JSImport("@storybook/components/dist/blocks/Story", "StoryError")
  @js.native
  object StoryError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StoryError & String] = js.native
    
    @js.native
    sealed trait NO_STORY
      extends StObject
         with StoryError
    /* "No component or story to display" */ val NO_STORY: typings.storybookComponents.storyMod.StoryError.NO_STORY & String = js.native
  }
  
  trait CommonProps extends StObject {
    
    var height: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var title: String
  }
  object CommonProps {
    
    inline def apply(id: String, title: String): CommonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    extension [Self <: CommonProps](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type IFrameStoryProps = CommonProps
  
  trait InlineStoryProps
    extends StObject
       with CommonProps {
    
    var parameters: Parameters
    
    var storyFn: ElementType[js.Any]
  }
  object InlineStoryProps {
    
    inline def apply(id: String, parameters: Parameters, storyFn: ElementType[js.Any], title: String): InlineStoryProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineStoryProps]
    }
    
    extension [Self <: InlineStoryProps](x: Self) {
      
      inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setStoryFn(value: ElementType[js.Any]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryProps = InlineStoryProps | IFrameStoryProps
}
