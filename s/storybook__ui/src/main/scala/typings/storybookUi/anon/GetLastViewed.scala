package typings.storybookUi.anon

import typings.storybookUi.sidebarTypesMod.StoryRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLastViewed extends StObject {
  
  def clearLastViewed(): Unit
  
  def getLastViewed(): js.Array[StoryRef]
}
object GetLastViewed {
  
  inline def apply(clearLastViewed: () => Unit, getLastViewed: () => js.Array[StoryRef]): GetLastViewed = {
    val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed), getLastViewed = js.Any.fromFunction0(getLastViewed))
    __obj.asInstanceOf[GetLastViewed]
  }
  
  extension [Self <: GetLastViewed](x: Self) {
    
    inline def setClearLastViewed(value: () => Unit): Self = StObject.set(x, "clearLastViewed", js.Any.fromFunction0(value))
    
    inline def setGetLastViewed(value: () => js.Array[StoryRef]): Self = StObject.set(x, "getLastViewed", js.Any.fromFunction0(value))
  }
}
