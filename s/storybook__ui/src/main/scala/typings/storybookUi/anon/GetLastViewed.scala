package typings.storybookUi.anon

import typings.storybookUi.sidebarTypesMod.StoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLastViewed extends js.Object {
  
  def clearLastViewed(): Unit = js.native
  
  def getLastViewed(): js.Array[StoryRef] = js.native
}
object GetLastViewed {
  
  @scala.inline
  def apply(clearLastViewed: () => Unit, getLastViewed: () => js.Array[StoryRef]): GetLastViewed = {
    val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed), getLastViewed = js.Any.fromFunction0(getLastViewed))
    __obj.asInstanceOf[GetLastViewed]
  }
  
  @scala.inline
  implicit class GetLastViewedOps[Self <: GetLastViewed] (val x: Self) extends AnyVal {
    
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
    def setClearLastViewed(value: () => Unit): Self = this.set("clearLastViewed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastViewed(value: () => js.Array[StoryRef]): Self = this.set("getLastViewed", js.Any.fromFunction0(value))
  }
}
