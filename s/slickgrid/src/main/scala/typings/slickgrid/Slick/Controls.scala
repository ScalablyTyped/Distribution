package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  trait ColumnPicker[T /* <: SlickData */] extends StObject {
    
    def destroy(): Unit
    
    def getAllColumns(): js.Array[Column[T]]
  }
  object ColumnPicker {
    
    inline def apply[T /* <: SlickData */](destroy: () => Unit, getAllColumns: () => js.Array[Column[T]]): ColumnPicker[T] = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAllColumns = js.Any.fromFunction0(getAllColumns))
      __obj.asInstanceOf[ColumnPicker[T]]
    }
    
    extension [Self <: ColumnPicker[?], T /* <: SlickData */](x: Self & ColumnPicker[T]) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetAllColumns(value: () => js.Array[Column[T]]): Self = StObject.set(x, "getAllColumns", js.Any.fromFunction0(value))
    }
  }
  
  trait SlickColumnPickerOptions extends StObject {
    
    var fadeSpeed: js.UndefOr[Double] = js.undefined
  }
  object SlickColumnPickerOptions {
    
    inline def apply(): SlickColumnPickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlickColumnPickerOptions]
    }
    
    extension [Self <: SlickColumnPickerOptions](x: Self) {
      
      inline def setFadeSpeed(value: Double): Self = StObject.set(x, "fadeSpeed", value.asInstanceOf[js.Any])
      
      inline def setFadeSpeedUndefined: Self = StObject.set(x, "fadeSpeed", js.undefined)
    }
  }
}
