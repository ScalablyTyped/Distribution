package typings.storybookReactRouter

import typings.reactRouter.mod.MemoryRouterProps
import typings.storybookAddons.typesMod.StoryApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Links extends StObject {
    
    var links: js.Object
    
    var routerProps: MemoryRouterProps
    
    var story: StoryApi[js.Any]
  }
  object Links {
    
    inline def apply(links: js.Object, routerProps: MemoryRouterProps, story: StoryApi[js.Any]): Links = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    extension [Self <: Links](x: Self) {
      
      inline def setLinks(value: js.Object): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRouterProps(value: MemoryRouterProps): Self = StObject.set(x, "routerProps", value.asInstanceOf[js.Any])
      
      inline def setStory(value: StoryApi[js.Any]): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    }
  }
}
