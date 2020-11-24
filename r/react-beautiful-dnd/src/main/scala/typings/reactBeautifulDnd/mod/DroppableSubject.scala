package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableSubject extends js.Object {
  
  // The hitbox for a droppable
  // - page margin box
  // - with scroll changes
  // - with any additional droppable placeholder
  // - clipped by frame
  // The subject will be null if the hit area is completely empty
  var active: js.UndefOr[Rect] = js.native
  
  // raw, unchanging
  var page: BoxModel = js.native
  
  var withPlaceholder: js.UndefOr[PlaceholderInSubject] = js.native
}
object DroppableSubject {
  
  @scala.inline
  def apply(page: BoxModel): DroppableSubject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableSubject]
  }
  
  @scala.inline
  implicit class DroppableSubjectOps[Self <: DroppableSubject] (val x: Self) extends AnyVal {
    
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
    def setPage(value: BoxModel): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Rect): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setWithPlaceholder(value: PlaceholderInSubject): Self = this.set("withPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithPlaceholder: Self = this.set("withPlaceholder", js.undefined)
  }
}
