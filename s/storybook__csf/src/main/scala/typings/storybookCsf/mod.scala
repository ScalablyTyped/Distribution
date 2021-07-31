package typings.storybookCsf

import typings.std.RegExp
import typings.storybookCsf.anon.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/csf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isExportStory(key: String, hasIncludeStoriesExcludeStories: IncludeExcludeOptions): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportStory")(key.asInstanceOf[js.Any], hasIncludeStoriesExcludeStories.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  
  @scala.inline
  def parseKind(kind: String, hasRootSeparatorGroupSeparator: SeparatorOptions): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKind")(kind.asInstanceOf[js.Any], hasRootSeparatorGroupSeparator.asInstanceOf[js.Any])).asInstanceOf[Groups]
  
  @scala.inline
  def sanitize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def storyNameFromExport(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("storyNameFromExport")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toId(kind: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait IncludeExcludeOptions extends StObject {
    
    var excludeStories: js.UndefOr[StoryDescriptor] = js.undefined
    
    var includeStories: js.UndefOr[StoryDescriptor] = js.undefined
  }
  object IncludeExcludeOptions {
    
    @scala.inline
    def apply(): IncludeExcludeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeExcludeOptions]
    }
    
    @scala.inline
    implicit class IncludeExcludeOptionsMutableBuilder[Self <: IncludeExcludeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeStories(value: StoryDescriptor): Self = StObject.set(x, "excludeStories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeStoriesUndefined: Self = StObject.set(x, "excludeStories", js.undefined)
      
      @scala.inline
      def setExcludeStoriesVarargs(value: String*): Self = StObject.set(x, "excludeStories", js.Array(value :_*))
      
      @scala.inline
      def setIncludeStories(value: StoryDescriptor): Self = StObject.set(x, "includeStories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeStoriesUndefined: Self = StObject.set(x, "includeStories", js.undefined)
      
      @scala.inline
      def setIncludeStoriesVarargs(value: String*): Self = StObject.set(x, "includeStories", js.Array(value :_*))
    }
  }
  
  trait SeparatorOptions extends StObject {
    
    var groupSeparator: String | RegExp
    
    var rootSeparator: String | RegExp
  }
  object SeparatorOptions {
    
    @scala.inline
    def apply(groupSeparator: String | RegExp, rootSeparator: String | RegExp): SeparatorOptions = {
      val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparatorOptions]
    }
    
    @scala.inline
    implicit class SeparatorOptionsMutableBuilder[Self <: SeparatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupSeparator(value: String | RegExp): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootSeparator(value: String | RegExp): Self = StObject.set(x, "rootSeparator", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryDescriptor = js.Array[String] | RegExp
}
