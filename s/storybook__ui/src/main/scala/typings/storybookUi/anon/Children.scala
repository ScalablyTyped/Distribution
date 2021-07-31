package typings.storybookUi.anon

import typings.react.mod.ReactNode
import typings.storybookUi.sidebarTypesMod.CombinedDataset
import typings.storybookUi.sidebarTypesMod.SearchChildrenFn
import typings.storybookUi.sidebarTypesMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: SearchChildrenFn
  
  def clearLastViewed(): Unit
  
  var dataset: CombinedDataset
  
  var enableShortcuts: js.UndefOr[Boolean] = js.undefined
  
  def getLastViewed(): js.Array[Selection]
  
  var initialQuery: js.UndefOr[String] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
}
object Children {
  
  @scala.inline
  def apply(
    children: /* args */ GetItemProps => ReactNode,
    clearLastViewed: () => Unit,
    dataset: CombinedDataset,
    getLastViewed: () => js.Array[Selection]
  ): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), clearLastViewed = js.Any.fromFunction0(clearLastViewed), dataset = dataset.asInstanceOf[js.Any], getLastViewed = js.Any.fromFunction0(getLastViewed))
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* args */ GetItemProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearLastViewed(value: () => Unit): Self = StObject.set(x, "clearLastViewed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataset(value: CombinedDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableShortcuts(value: Boolean): Self = StObject.set(x, "enableShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableShortcutsUndefined: Self = StObject.set(x, "enableShortcuts", js.undefined)
    
    @scala.inline
    def setGetLastViewed(value: () => js.Array[Selection]): Self = StObject.set(x, "getLastViewed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitialQuery(value: String): Self = StObject.set(x, "initialQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialQueryUndefined: Self = StObject.set(x, "initialQuery", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
  }
}
