package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderInSubject extends StObject {
  
  // might not actually be increased by
  // placeholder if there is no required space
  var increasedBy: js.UndefOr[Position] = js.undefined
  
  // max scroll before placeholder added
  // will be null if there was no frame
  var oldFrameMaxScroll: js.UndefOr[Position] = js.undefined
  
  var placeholderSize: Position
}
object PlaceholderInSubject {
  
  @scala.inline
  def apply(placeholderSize: Position): PlaceholderInSubject = {
    val __obj = js.Dynamic.literal(placeholderSize = placeholderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderInSubject]
  }
  
  @scala.inline
  implicit class PlaceholderInSubjectMutableBuilder[Self <: PlaceholderInSubject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncreasedBy(value: Position): Self = StObject.set(x, "increasedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreasedByUndefined: Self = StObject.set(x, "increasedBy", js.undefined)
    
    @scala.inline
    def setOldFrameMaxScroll(value: Position): Self = StObject.set(x, "oldFrameMaxScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldFrameMaxScrollUndefined: Self = StObject.set(x, "oldFrameMaxScroll", js.undefined)
    
    @scala.inline
    def setPlaceholderSize(value: Position): Self = StObject.set(x, "placeholderSize", value.asInstanceOf[js.Any])
  }
}
