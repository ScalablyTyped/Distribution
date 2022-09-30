package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOneOf
  extends StObject
     with AnyNestedObject {
  
  /** Oneof field names */
  var oneof: js.Array[String]
  
  /** Oneof options */
  var options: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object IOneOf {
  
  inline def apply(oneof: js.Array[String]): IOneOf = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneOf]
  }
  
  extension [Self <: IOneOf](x: Self) {
    
    inline def setOneof(value: js.Array[String]): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    inline def setOneofVarargs(value: String*): Self = StObject.set(x, "oneof", js.Array(value*))
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
