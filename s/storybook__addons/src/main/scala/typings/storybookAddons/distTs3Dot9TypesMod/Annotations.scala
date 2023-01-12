package typings.storybookAddons.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations[Args, StoryFnReturnType]
  extends StObject
     with BaseAnnotations[Args, StoryFnReturnType] {
  
  /**
    * Used to exclude certain named exports. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * excludeStories: ['simpleData', 'complexData']
    * excludeStories: /.*Data$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var excludeStories: js.UndefOr[js.Array[String] | js.RegExp] = js.undefined
  
  /**
    * Used to only include certain named exports as stories. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * includeStories: ['SimpleStory', 'ComplexStory']
    * includeStories: /.*Story$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var includeStories: js.UndefOr[js.Array[String] | js.RegExp] = js.undefined
}
object Annotations {
  
  inline def apply[Args, StoryFnReturnType](): Annotations[Args, StoryFnReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotations[Args, StoryFnReturnType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotations[?, ?], Args, StoryFnReturnType] (val x: Self & (Annotations[Args, StoryFnReturnType])) extends AnyVal {
    
    inline def setExcludeStories(value: js.Array[String] | js.RegExp): Self = StObject.set(x, "excludeStories", value.asInstanceOf[js.Any])
    
    inline def setExcludeStoriesUndefined: Self = StObject.set(x, "excludeStories", js.undefined)
    
    inline def setExcludeStoriesVarargs(value: String*): Self = StObject.set(x, "excludeStories", js.Array(value*))
    
    inline def setIncludeStories(value: js.Array[String] | js.RegExp): Self = StObject.set(x, "includeStories", value.asInstanceOf[js.Any])
    
    inline def setIncludeStoriesUndefined: Self = StObject.set(x, "includeStories", js.undefined)
    
    inline def setIncludeStoriesVarargs(value: String*): Self = StObject.set(x, "includeStories", js.Array(value*))
  }
}
