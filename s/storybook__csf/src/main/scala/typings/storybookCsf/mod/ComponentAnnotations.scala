package typings.storybookCsf.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentAnnotations[TRenderer /* <: Renderer */, TArgs]
  extends StObject
     with BaseAnnotations[TRenderer, TArgs] {
  
  /**
    * The primary component for your story.
    *
    * Used by addons for automatic prop table generation and display of other component metadata.
    */
  var component: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.0<TArgs>['component'] */ js.Any
  ] = js.undefined
  
  /**
    * Used to exclude certain named exports. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * excludeStories: ['simpleData', 'complexData']
    * excludeStories: /.*Data$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var excludeStories: js.UndefOr[StoryDescriptor1] = js.undefined
  
  /**
    * Id of the component (prefix of the story id) which is used for URLs.
    *
    * By default is inferred from sanitizing the title
    *
    * @see [Story Hierarchy](https://storybook.js.org/docs/basics/writing-stories/#story-hierarchy)
    */
  var id: js.UndefOr[ComponentId] = js.undefined
  
  /**
    * Used to only include certain named exports as stories. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * includeStories: ['SimpleStory', 'ComplexStory']
    * includeStories: /.*Story$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var includeStories: js.UndefOr[StoryDescriptor1] = js.undefined
  
  /**
    * Function that is executed after the story is rendered.
    */
  var play: js.UndefOr[PlayFunction[TRenderer, TArgs]] = js.undefined
  
  /**
    * Auxiliary subcomponents that are part of the stories.
    *
    * Used by addons for automatic prop table generation and display of other component metadata.
    *
    * @example
    * import { Button, ButtonGroup } from './components';
    *
    * export default {
    *   ...
    *   subcomponents: { Button, ButtonGroup }
    * }
    *
    * By defining them each component will have its tab in the args table.
    */
  var subcomponents: js.UndefOr[
    Record[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRenderer['component'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * Named tags for a story, used to filter stories in different contexts.
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  /**
    * Title of the component which will be presented in the navigation. **Should be unique.**
    *
    * Components can be organized in a nested structure using "/" as a separator.
    *
    * Since CSF 3.0 this property is optional -- it can be inferred from the filesystem path
    *
    * @example
    * export default {
    *   ...
    *   title: 'Design System/Atoms/Button'
    * }
    *
    * @see [Story Hierarchy](https://storybook.js.org/docs/basics/writing-stories/#story-hierarchy)
    */
  var title: js.UndefOr[ComponentTitle] = js.undefined
}
object ComponentAnnotations {
  
  inline def apply[TRenderer /* <: Renderer */, TArgs](): ComponentAnnotations[TRenderer, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentAnnotations[TRenderer, TArgs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentAnnotations[?, ?], TRenderer /* <: Renderer */, TArgs] (val x: Self & (ComponentAnnotations[TRenderer, TArgs])) extends AnyVal {
    
    inline def setComponent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.0<TArgs>['component'] */ js.Any
    ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setExcludeStories(value: StoryDescriptor1): Self = StObject.set(x, "excludeStories", value.asInstanceOf[js.Any])
    
    inline def setExcludeStoriesUndefined: Self = StObject.set(x, "excludeStories", js.undefined)
    
    inline def setExcludeStoriesVarargs(value: String*): Self = StObject.set(x, "excludeStories", js.Array(value*))
    
    inline def setId(value: ComponentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIncludeStories(value: StoryDescriptor1): Self = StObject.set(x, "includeStories", value.asInstanceOf[js.Any])
    
    inline def setIncludeStoriesUndefined: Self = StObject.set(x, "includeStories", js.undefined)
    
    inline def setIncludeStoriesVarargs(value: String*): Self = StObject.set(x, "includeStories", js.Array(value*))
    
    inline def setPlay(value: /* context */ PlayFunctionContext[TRenderer, TArgs] => js.Promise[Unit] | Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setSubcomponents(
      value: Record[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: TRenderer['component'] */ js.Any
        ]
    ): Self = StObject.set(x, "subcomponents", value.asInstanceOf[js.Any])
    
    inline def setSubcomponentsUndefined: Self = StObject.set(x, "subcomponents", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: ComponentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
