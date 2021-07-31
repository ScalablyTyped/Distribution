package typings.reactRelay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor extends StObject {
  
  var cursor: js.UndefOr[String | Null] = js.undefined
  
  var hasMore: Boolean
}
object Cursor {
  
  @scala.inline
  def apply(hasMore: Boolean): Cursor = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
  
  @scala.inline
  implicit class CursorMutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorNull: Self = StObject.set(x, "cursor", null)
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
  }
}
