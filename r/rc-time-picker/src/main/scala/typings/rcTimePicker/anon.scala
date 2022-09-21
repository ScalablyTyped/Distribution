package typings.rcTimePicker

import typings.rcTimePicker.rcTimePickerBooleans.`false`
import typings.rcTimePicker.rcTimePickerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var open: `false`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(open = false)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setOpen(value: `false`): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait Open extends StObject {
    
    var open: `true`
  }
  object Open {
    
    inline def apply(): Open = {
      val __obj = js.Dynamic.literal(open = true)
      __obj.asInstanceOf[Open]
    }
    
    extension [Self <: Open](x: Self) {
      
      inline def setOpen(value: `true`): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
