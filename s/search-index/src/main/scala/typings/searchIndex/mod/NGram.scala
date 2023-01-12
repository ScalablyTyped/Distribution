package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NGram extends StObject {
  
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  var join: String
  
  var lengths: js.Array[Double]
}
object NGram {
  
  inline def apply(join: String, lengths: js.Array[Double]): NGram = {
    val __obj = js.Dynamic.literal(join = join.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NGram] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setJoin(value: String): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
    
    inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
  }
}
