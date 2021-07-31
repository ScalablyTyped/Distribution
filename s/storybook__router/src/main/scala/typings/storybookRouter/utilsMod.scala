package typings.storybookRouter

import org.scalablytyped.runtime.StringDictionary
import typings.storybookRouter.anon.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/router/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMatch(current: String, target: String): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  @scala.inline
  def getMatch(current: String, target: String, startsWith: js.Any): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], startsWith.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  
  @scala.inline
  def parsePath(): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[StoryData]
  @scala.inline
  def parsePath(path: String): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[StoryData]
  
  @scala.inline
  def queryFromLocation(location: Search): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromLocation")(location.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  @scala.inline
  def queryFromString(s: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")(s.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  @scala.inline
  def stringifyQuery(query: Query): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait Match extends StObject {
    
    var path: String
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
  
  trait StoryData extends StObject {
    
    var refId: js.UndefOr[String] = js.undefined
    
    var storyId: js.UndefOr[String] = js.undefined
    
    var viewMode: js.UndefOr[String] = js.undefined
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
