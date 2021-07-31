package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Len extends StObject {
  
  var len: js.UndefOr[ValidateMessage] = js.undefined
  
  var max: js.UndefOr[ValidateMessage] = js.undefined
  
  var min: js.UndefOr[ValidateMessage] = js.undefined
  
  var range: js.UndefOr[ValidateMessage] = js.undefined
}
object Len {
  
  @scala.inline
  def apply(): Len = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Len]
  }
  
  @scala.inline
  implicit class LenMutableBuilder[Self <: Len] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLen(value: ValidateMessage): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenFunction0(value: () => String): Self = StObject.set(x, "len", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    @scala.inline
    def setMax(value: ValidateMessage): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFunction0(value: () => String): Self = StObject.set(x, "max", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: ValidateMessage): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFunction0(value: () => String): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setRange(value: ValidateMessage): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeFunction0(value: () => String): Self = StObject.set(x, "range", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
