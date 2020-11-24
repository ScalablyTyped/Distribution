package typings.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowNext extends js.Object {
  
  var showNext: Boolean = js.native
  
  var showPrev: Boolean = js.native
  
  var transform: String = js.native
}
object ShowNext {
  
  @scala.inline
  def apply(showNext: Boolean, showPrev: Boolean, transform: String): ShowNext = {
    val __obj = js.Dynamic.literal(showNext = showNext.asInstanceOf[js.Any], showPrev = showPrev.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowNext]
  }
  
  @scala.inline
  implicit class ShowNextOps[Self <: ShowNext] (val x: Self) extends AnyVal {
    
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
    def setShowNext(value: Boolean): Self = this.set("showNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrev(value: Boolean): Self = this.set("showPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
}
