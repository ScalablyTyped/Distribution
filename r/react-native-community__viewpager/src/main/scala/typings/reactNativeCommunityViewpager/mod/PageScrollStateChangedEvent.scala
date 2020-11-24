package typings.reactNativeCommunityViewpager.mod

import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.dragging
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.idle
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.settling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageScrollStateChangedEvent extends js.Object {
  
  var pageScrollState: idle | dragging | settling = js.native
}
object PageScrollStateChangedEvent {
  
  @scala.inline
  def apply(pageScrollState: idle | dragging | settling): PageScrollStateChangedEvent = {
    val __obj = js.Dynamic.literal(pageScrollState = pageScrollState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollStateChangedEvent]
  }
  
  @scala.inline
  implicit class PageScrollStateChangedEventOps[Self <: PageScrollStateChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setPageScrollState(value: idle | dragging | settling): Self = this.set("pageScrollState", value.asInstanceOf[js.Any])
  }
}
