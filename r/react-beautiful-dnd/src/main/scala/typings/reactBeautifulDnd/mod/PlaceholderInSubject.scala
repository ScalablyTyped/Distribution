package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderInSubject extends StObject {
  
  // might not actually be increased by
  // placeholder if there is no required space
  var increasedBy: js.UndefOr[Position | Null] = js.undefined
  
  // max scroll before placeholder added
  // will be null if there was no frame
  var oldFrameMaxScroll: js.UndefOr[Position | Null] = js.undefined
  
  var placeholderSize: Position
}
object PlaceholderInSubject {
  
  inline def apply(placeholderSize: Position): PlaceholderInSubject = {
    val __obj = js.Dynamic.literal(placeholderSize = placeholderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderInSubject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceholderInSubject] (val x: Self) extends AnyVal {
    
    inline def setIncreasedBy(value: Position): Self = StObject.set(x, "increasedBy", value.asInstanceOf[js.Any])
    
    inline def setIncreasedByNull: Self = StObject.set(x, "increasedBy", null)
    
    inline def setIncreasedByUndefined: Self = StObject.set(x, "increasedBy", js.undefined)
    
    inline def setOldFrameMaxScroll(value: Position): Self = StObject.set(x, "oldFrameMaxScroll", value.asInstanceOf[js.Any])
    
    inline def setOldFrameMaxScrollNull: Self = StObject.set(x, "oldFrameMaxScroll", null)
    
    inline def setOldFrameMaxScrollUndefined: Self = StObject.set(x, "oldFrameMaxScroll", js.undefined)
    
    inline def setPlaceholderSize(value: Position): Self = StObject.set(x, "placeholderSize", value.asInstanceOf[js.Any])
  }
}
