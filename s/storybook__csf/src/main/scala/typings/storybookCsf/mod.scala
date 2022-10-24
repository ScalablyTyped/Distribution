package typings.storybookCsf

import typings.storybookCsf.anon.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/csf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isExportStory(key: String, param1: IncludeExcludeOptions): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportStory")(key.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  
  inline def parseKind(kind: String, param1: SeparatorOptions): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKind")(kind.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Groups]
  
  inline def sanitize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def storyNameFromExport(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("storyNameFromExport")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toId(kind: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait IncludeExcludeOptions extends StObject {
    
    var excludeStories: js.UndefOr[StoryDescriptor] = js.undefined
    
    var includeStories: js.UndefOr[StoryDescriptor] = js.undefined
  }
  object IncludeExcludeOptions {
    
    inline def apply(): IncludeExcludeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeExcludeOptions]
    }
    
    extension [Self <: IncludeExcludeOptions](x: Self) {
      
      inline def setExcludeStories(value: StoryDescriptor): Self = StObject.set(x, "excludeStories", value.asInstanceOf[js.Any])
      
      inline def setExcludeStoriesUndefined: Self = StObject.set(x, "excludeStories", js.undefined)
      
      inline def setExcludeStoriesVarargs(value: String*): Self = StObject.set(x, "excludeStories", js.Array(value*))
      
      inline def setIncludeStories(value: StoryDescriptor): Self = StObject.set(x, "includeStories", value.asInstanceOf[js.Any])
      
      inline def setIncludeStoriesUndefined: Self = StObject.set(x, "includeStories", js.undefined)
      
      inline def setIncludeStoriesVarargs(value: String*): Self = StObject.set(x, "includeStories", js.Array(value*))
    }
  }
  
  trait SeparatorOptions extends StObject {
    
    var groupSeparator: String | js.RegExp
    
    var rootSeparator: String | js.RegExp
  }
  object SeparatorOptions {
    
    inline def apply(groupSeparator: String | js.RegExp, rootSeparator: String | js.RegExp): SeparatorOptions = {
      val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparatorOptions]
    }
    
    extension [Self <: SeparatorOptions](x: Self) {
      
      inline def setGroupSeparator(value: String | js.RegExp): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      inline def setRootSeparator(value: String | js.RegExp): Self = StObject.set(x, "rootSeparator", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryDescriptor = js.Array[String] | js.RegExp
}
