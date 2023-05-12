package typings.smallweiAvue.anon

import typings.smallweiAvue.FullField
import typings.smallweiAvue.RangeNumber
import typings.smallweiAvue.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Len extends StObject {
  
  var len: js.UndefOr[ValidateMessage[js.Tuple2[FullField, RangeNumber]]] = js.undefined
  
  var max: js.UndefOr[ValidateMessage[js.Tuple2[FullField, RangeNumber]]] = js.undefined
  
  var min: js.UndefOr[ValidateMessage[js.Tuple2[FullField, RangeNumber]]] = js.undefined
  
  var range: js.UndefOr[ValidateMessage[js.Tuple3[FullField, RangeNumber, RangeNumber]]] = js.undefined
}
object Len {
  
  inline def apply(): Len = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Len]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Len] (val x: Self) extends AnyVal {
    
    inline def setLen(value: ValidateMessage[js.Tuple2[FullField, RangeNumber]]): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenFunction1(value: js.Tuple2[FullField, RangeNumber] => String): Self = StObject.set(x, "len", js.Any.fromFunction1(value))
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setMax(value: ValidateMessage[js.Tuple2[FullField, RangeNumber]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxFunction1(value: js.Tuple2[FullField, RangeNumber] => String): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: ValidateMessage[js.Tuple2[FullField, RangeNumber]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinFunction1(value: js.Tuple2[FullField, RangeNumber] => String): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRange(value: ValidateMessage[js.Tuple3[FullField, RangeNumber, RangeNumber]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeFunction1(value: js.Tuple3[FullField, RangeNumber, RangeNumber] => String): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
