package typings.storybookRouter

import org.scalablytyped.runtime.StringDictionary
import typings.storybookRouter.anon.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/router/dist/utils", "getMatch")
  @js.native
  def getMatch(current: String, target: String): Match | Null = js.native
  @JSImport("@storybook/router/dist/utils", "getMatch")
  @js.native
  def getMatch(current: String, target: String, startsWith: js.Any): Match | Null = js.native
  
  @JSImport("@storybook/router/dist/utils", "parsePath")
  @js.native
  def parsePath(): StoryData = js.native
  @JSImport("@storybook/router/dist/utils", "parsePath")
  @js.native
  def parsePath(path: String): StoryData = js.native
  
  @JSImport("@storybook/router/dist/utils", "queryFromLocation")
  @js.native
  def queryFromLocation(location: Search): Query = js.native
  
  @JSImport("@storybook/router/dist/utils", "queryFromString")
  @js.native
  def queryFromString(s: String): Query = js.native
  
  @JSImport("@storybook/router/dist/utils", "stringifyQuery")
  @js.native
  def stringifyQuery(query: Query): js.Any = js.native
  
  @js.native
  trait Match extends StObject {
    
    var path: String = js.native
  }
  object Match {
    
    @scala.inline
    def apply(path: String): Match = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type Query = StringDictionary[js.Any]
  
  @js.native
  trait StoryData extends StObject {
    
    var refId: js.UndefOr[String] = js.native
    
    var storyId: js.UndefOr[String] = js.native
    
    var viewMode: js.UndefOr[String] = js.native
  }
  object StoryData {
    
    @scala.inline
    def apply(): StoryData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryData]
    }
    
    @scala.inline
    implicit class StoryDataMutableBuilder[Self <: StoryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      @scala.inline
      def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
}
