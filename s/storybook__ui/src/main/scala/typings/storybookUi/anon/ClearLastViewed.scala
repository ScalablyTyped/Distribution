package typings.storybookUi.anon

import typings.react.mod.ReactNode
import typings.storybookUi.sidebarTypesMod.CombinedDataset
import typings.storybookUi.sidebarTypesMod.SearchChildrenFn
import typings.storybookUi.sidebarTypesMod.StoryRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearLastViewed extends StObject {
  
  var children: SearchChildrenFn
  
  def clearLastViewed(): Unit
  
  var dataset: CombinedDataset
  
  var enableShortcuts: js.UndefOr[Boolean] = js.undefined
  
  def getLastViewed(): js.Array[StoryRef]
  
  var initialQuery: js.UndefOr[String] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
}
object ClearLastViewed {
  
  inline def apply(
    children: /* args */ GetItemProps => ReactNode,
    clearLastViewed: () => Unit,
    dataset: CombinedDataset,
    getLastViewed: () => js.Array[StoryRef]
  ): ClearLastViewed = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), clearLastViewed = js.Any.fromFunction0(clearLastViewed), dataset = dataset.asInstanceOf[js.Any], getLastViewed = js.Any.fromFunction0(getLastViewed))
    __obj.asInstanceOf[ClearLastViewed]
  }
  
  extension [Self <: ClearLastViewed](x: Self) {
    
    inline def setChildren(value: /* args */ GetItemProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setClearLastViewed(value: () => Unit): Self = StObject.set(x, "clearLastViewed", js.Any.fromFunction0(value))
    
    inline def setDataset(value: CombinedDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setEnableShortcuts(value: Boolean): Self = StObject.set(x, "enableShortcuts", value.asInstanceOf[js.Any])
    
    inline def setEnableShortcutsUndefined: Self = StObject.set(x, "enableShortcuts", js.undefined)
    
    inline def setGetLastViewed(value: () => js.Array[StoryRef]): Self = StObject.set(x, "getLastViewed", js.Any.fromFunction0(value))
    
    inline def setInitialQuery(value: String): Self = StObject.set(x, "initialQuery", value.asInstanceOf[js.Any])
    
    inline def setInitialQueryUndefined: Self = StObject.set(x, "initialQuery", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
  }
}
