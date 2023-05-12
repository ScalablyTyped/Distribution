package typings.reactCalendar.anon

import typings.react.mod.ElementType
import typings.reactCalendar.distCjsSharedTypesMod.RangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count[T /* <: ElementType[Any] */] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  def dateTransform(point: Double): js.Date
  
  var dateType: RangeType
  
  var end: Double
  
  var hover: js.UndefOr[js.Date] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var start: Double
  
  var step: js.UndefOr[Double] = js.undefined
  
  var tile: T
  
  var value: js.UndefOr[js.Date] = js.undefined
  
  var valueType: RangeType
}
object Count {
  
  inline def apply[T /* <: ElementType[Any] */](
    dateTransform: Double => js.Date,
    dateType: RangeType,
    end: Double,
    start: Double,
    tile: T,
    valueType: RangeType
  ): Count[T] = {
    val __obj = js.Dynamic.literal(dateTransform = js.Any.fromFunction1(dateTransform), dateType = dateType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Count[?], T /* <: ElementType[Any] */] (val x: Self & Count[T]) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDateTransform(value: Double => js.Date): Self = StObject.set(x, "dateTransform", js.Any.fromFunction1(value))
    
    inline def setDateType(value: RangeType): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setHover(value: js.Date): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTile(value: T): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: RangeType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
