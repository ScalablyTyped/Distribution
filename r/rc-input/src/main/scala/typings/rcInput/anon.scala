package typings.rcInput

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearIcon extends StObject {
    
    var clearIcon: js.UndefOr[ReactNode] = js.undefined
  }
  object ClearIcon {
    
    inline def apply(): ClearIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearIcon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
      
      inline def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var value: String
  }
  object Count {
    
    inline def apply(count: Double, value: String): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
