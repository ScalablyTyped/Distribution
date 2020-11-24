package typings.storybookUi.anon

import typings.react.mod.ReactNode
import typings.storybookUi.sidebarTypesMod.CombinedDataset
import typings.storybookUi.sidebarTypesMod.SearchChildrenFn
import typings.storybookUi.sidebarTypesMod.StoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearLastViewed extends js.Object {
  
  var children: SearchChildrenFn = js.native
  
  def clearLastViewed(): Unit = js.native
  
  var dataset: CombinedDataset = js.native
  
  var enableShortcuts: js.UndefOr[Boolean] = js.native
  
  def getLastViewed(): js.Array[StoryRef] = js.native
  
  var initialQuery: js.UndefOr[String] = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
}
object ClearLastViewed {
  
  @scala.inline
  def apply(
    children: /* args */ GetItemProps => ReactNode,
    clearLastViewed: () => Unit,
    dataset: CombinedDataset,
    getLastViewed: () => js.Array[StoryRef]
  ): ClearLastViewed = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), clearLastViewed = js.Any.fromFunction0(clearLastViewed), dataset = dataset.asInstanceOf[js.Any], getLastViewed = js.Any.fromFunction0(getLastViewed))
    __obj.asInstanceOf[ClearLastViewed]
  }
  
  @scala.inline
  implicit class ClearLastViewedOps[Self <: ClearLastViewed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: /* args */ GetItemProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearLastViewed(value: () => Unit): Self = this.set("clearLastViewed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataset(value: CombinedDataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLastViewed(value: () => js.Array[StoryRef]): Self = this.set("getLastViewed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableShortcuts(value: Boolean): Self = this.set("enableShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableShortcuts: Self = this.set("enableShortcuts", js.undefined)
    
    @scala.inline
    def setInitialQuery(value: String): Self = this.set("initialQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialQuery: Self = this.set("initialQuery", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
  }
}
