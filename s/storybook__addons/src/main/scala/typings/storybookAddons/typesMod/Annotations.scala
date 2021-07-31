package typings.storybookAddons.typesMod

import typings.std.Partial
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations[Args, StoryFnReturnType] extends StObject {
  
  /**
    * ArgTypes encode basic metadata for args, such as `name`, `description`, `defaultValue` for an arg. These get automatically filled in by Storybook Docs.
    * @see [Control annotations](https://github.com/storybookjs/storybook/blob/91e9dee33faa8eff0b342a366845de7100415367/addons/controls/README.md#control-annotations)
    */
  var argTypes: js.UndefOr[ArgTypes] = js.undefined
  
  /**
    * Dynamic data that are provided (and possibly updated by) Storybook and its addons.
    * @see [Arg story inputs](https://github.com/storybookjs/storybook/blob/next/docs/src/pages/formats/component-story-format/index.md#args-story-inputs)
    */
  var args: js.UndefOr[Partial[Args]] = js.undefined
  
  /**
    * Wrapper components or Storybook decorators that wrap a story.
    *
    * Decorators defined in Meta will be applied to every story variation.
    * @see [Decorators](https://storybook.js.org/docs/addons/introduction/#1-decorators)
    */
  var decorators: js.UndefOr[BaseDecorators[StoryFnReturnType]] = js.undefined
  
  /**
    * Used to exclude certain named exports. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * excludeStories: ['simpleData', 'complexData']
    * excludeStories: /.*Data$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var excludeStories: js.UndefOr[js.Array[String] | RegExp] = js.undefined
  
  /**
    * Used to only include certain named exports as stories. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * includeStories: ['SimpleStory', 'ComplexStory']
    * includeStories: /.*Story$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var includeStories: js.UndefOr[js.Array[String] | RegExp] = js.undefined
  
  /**
    * Custom metadata for a story.
    * @see [Parameters](https://storybook.js.org/docs/basics/writing-stories/#parameters)
    */
  var parameters: js.UndefOr[Parameters] = js.undefined
}
object Annotations {
  
  @scala.inline
  def apply[Args, StoryFnReturnType](): Annotations[Args, StoryFnReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotations[Args, StoryFnReturnType]]
  }
  
  @scala.inline
  implicit class AnnotationsMutableBuilder[Self <: Annotations[?, ?], Args, StoryFnReturnType] (val x: Self & (Annotations[Args, StoryFnReturnType])) extends AnyVal {
    
    @scala.inline
    def setArgTypes(value: ArgTypes): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
    
    @scala.inline
    def setArgs(value: Partial[Args]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setDecorators(value: BaseDecorators[StoryFnReturnType]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(
      value: (js.Function2[
          /* story */ js.Function0[StoryFnReturnType], 
          /* context */ StoryContext, 
          StoryFnReturnType
        ])*
    ): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setExcludeStories(value: js.Array[String] | RegExp): Self = StObject.set(x, "excludeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeStoriesUndefined: Self = StObject.set(x, "excludeStories", js.undefined)
    
    @scala.inline
    def setExcludeStoriesVarargs(value: String*): Self = StObject.set(x, "excludeStories", js.Array(value :_*))
    
    @scala.inline
    def setIncludeStories(value: js.Array[String] | RegExp): Self = StObject.set(x, "includeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStoriesUndefined: Self = StObject.set(x, "includeStories", js.undefined)
    
    @scala.inline
    def setIncludeStoriesVarargs(value: String*): Self = StObject.set(x, "includeStories", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
