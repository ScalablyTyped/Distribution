package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableSubject extends StObject {
  
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
  implicit class DroppableSubjectMutableBuilder[Self <: DroppableSubject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Rect): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setPage(value: BoxModel): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithPlaceholder(value: PlaceholderInSubject): Self = StObject.set(x, "withPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithPlaceholderUndefined: Self = StObject.set(x, "withPlaceholder", js.undefined)
  }
}
