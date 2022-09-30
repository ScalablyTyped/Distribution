package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Gte extends StObject {
    
    var gte: String
    
    var keyEncoding: String
    
    var keys: Boolean
    
    var lte: String
    
    var valueEncoding: String
    
    var values: Boolean
  }
  object Gte {
    
    inline def apply(
      gte: String,
      keyEncoding: String,
      keys: Boolean,
      lte: String,
      valueEncoding: String,
      values: Boolean
    ): Gte = {
      val __obj = js.Dynamic.literal(gte = gte.asInstanceOf[js.Any], keyEncoding = keyEncoding.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any], valueEncoding = valueEncoding.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gte]
    }
    
    extension [Self <: Gte](x: Self) {
      
      inline def setGte(value: String): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      inline def setKeyEncoding(value: String): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setLte(value: String): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      inline def setValueEncoding(value: String): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
