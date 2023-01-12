package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableSubject extends StObject {
  
  // The hitbox for a droppable
  // - page margin box
  // - with scroll changes
  // - with any additional droppable placeholder
  // - clipped by frame
  // The subject will be null if the hit area is completely empty
  var active: js.UndefOr[Rect] = js.undefined
  
  // raw, unchanging
  var page: BoxModel
  
  var withPlaceholder: js.UndefOr[PlaceholderInSubject] = js.undefined
}
object DroppableSubject {
  
  inline def apply(page: BoxModel): DroppableSubject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableSubject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableSubject] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Rect): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setPage(value: BoxModel): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setWithPlaceholder(value: PlaceholderInSubject): Self = StObject.set(x, "withPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setWithPlaceholderUndefined: Self = StObject.set(x, "withPlaceholder", js.undefined)
  }
}
