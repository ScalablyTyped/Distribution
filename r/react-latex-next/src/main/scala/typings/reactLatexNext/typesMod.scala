package typings.reactLatexNext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Delimiter extends StObject {
    
    var display: Boolean
    
    var left: String
    
    var right: String
  }
  object Delimiter {
    
    inline def apply(display: Boolean, left: String, right: String): Delimiter = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delimiter]
    }
    
    extension [Self <: Delimiter](x: Self) {
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait KatexData extends StObject {
    
    var data: String
    
    var display: js.UndefOr[Boolean] = js.undefined
    
    var rawData: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object KatexData {
    
    inline def apply(data: String, `type`: String): KatexData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KatexData]
    }
    
    extension [Self <: KatexData](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
      
      inline def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
