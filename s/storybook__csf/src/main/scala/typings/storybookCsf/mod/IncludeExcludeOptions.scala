package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeExcludeOptions extends StObject {
  
  var excludeStories: js.UndefOr[StoryDescriptor] = js.undefined
  
  var includeStories: js.UndefOr[StoryDescriptor] = js.undefined
}
object IncludeExcludeOptions {
  
  inline def apply(): IncludeExcludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeExcludeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeExcludeOptions] (val x: Self) extends AnyVal {
    
    inline def setExcludeStories(value: StoryDescriptor): Self = StObject.set(x, "excludeStories", value.asInstanceOf[js.Any])
    
    inline def setExcludeStoriesUndefined: Self = StObject.set(x, "excludeStories", js.undefined)
    
    inline def setExcludeStoriesVarargs(value: String*): Self = StObject.set(x, "excludeStories", js.Array(value*))
    
    inline def setIncludeStories(value: StoryDescriptor): Self = StObject.set(x, "includeStories", value.asInstanceOf[js.Any])
    
    inline def setIncludeStoriesUndefined: Self = StObject.set(x, "includeStories", js.undefined)
    
    inline def setIncludeStoriesVarargs(value: String*): Self = StObject.set(x, "includeStories", js.Array(value*))
  }
}
