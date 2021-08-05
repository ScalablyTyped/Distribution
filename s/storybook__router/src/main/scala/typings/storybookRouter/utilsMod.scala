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
  
  inline def getMatch(current: String, target: String): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  inline def getMatch(current: String, target: String, startsWith: js.Any): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], startsWith.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  
  inline def parsePath(): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[StoryData]
  inline def parsePath(path: String): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[StoryData]
  
  inline def queryFromLocation(location: Search): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromLocation")(location.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def queryFromString(s: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")(s.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def stringifyQuery(query: Query): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait Match extends StObject {
    
    var path: String
  }
  object Match {
    
    inline def apply(path: String): Match = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type Query = StringDictionary[js.Any]
  
  trait StoryData extends StObject {
    
    var refId: js.UndefOr[String] = js.undefined
    
    var storyId: js.UndefOr[String] = js.undefined
    
    var viewMode: js.UndefOr[String] = js.undefined
  }
  object StoryData {
    
    inline def apply(): StoryData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryData]
    }
    
    extension [Self <: StoryData](x: Self) {
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
}
