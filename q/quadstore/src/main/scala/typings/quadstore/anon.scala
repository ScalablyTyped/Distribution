package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Gte extends StObject {
    
    var gte: String
    
    var keyAsBuffer: Boolean
    
    var keys: Boolean
    
    var lte: String
    
    var valueAsBuffer: Boolean
    
    var values: Boolean
  }
  object Gte {
    
    inline def apply(
      gte: String,
      keyAsBuffer: Boolean,
      keys: Boolean,
      lte: String,
      valueAsBuffer: Boolean,
      values: Boolean
    ): Gte = {
      val __obj = js.Dynamic.literal(gte = gte.asInstanceOf[js.Any], keyAsBuffer = keyAsBuffer.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any], valueAsBuffer = valueAsBuffer.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gte]
    }
    
    extension [Self <: Gte](x: Self) {
      
      inline def setGte(value: String): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      inline def setKeyAsBuffer(value: Boolean): Self = StObject.set(x, "keyAsBuffer", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setLte(value: String): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      inline def setValueAsBuffer(value: Boolean): Self = StObject.set(x, "valueAsBuffer", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
