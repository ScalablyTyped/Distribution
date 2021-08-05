package typings.storybookApi.anon

import typings.storybookApi.storiesMod.StoriesRaw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stories extends StObject {
  
  var stories: StoriesRaw
  
  var v: js.UndefOr[Double] = js.undefined
}
object Stories {
  
  inline def apply(stories: StoriesRaw): Stories = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stories]
  }
  
  extension [Self <: Stories](x: Self) {
    
    inline def setStories(value: StoriesRaw): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
