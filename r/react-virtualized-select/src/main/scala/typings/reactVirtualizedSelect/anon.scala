package typings.reactVirtualizedSelect

import typings.reactVirtualizedSelect.reactVirtualizedSelectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Async extends StObject {
    
    var async: `true`
  }
  object Async {
    
    inline def apply(): Async = {
      val __obj = js.Dynamic.literal(async = true)
      __obj.asInstanceOf[Async]
    }
    
    extension [Self <: Async](x: Self) {
      
      inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    }
  }
  
  trait Option[TValue] extends StObject {
    
    var option: TValue
  }
  object Option {
    
    inline def apply[TValue](option: TValue): Option[TValue] = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option[TValue]]
    }
    
    extension [Self <: Option[?], TValue](x: Self & Option[TValue]) {
      
      inline def setOption(value: TValue): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
}
