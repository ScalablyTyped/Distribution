package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnum
  extends StObject
     with AnyNestedObject {
  
  /** Enum options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /** Enum values */
  var values: StringDictionary[Double]
}
object IEnum {
  
  inline def apply(values: StringDictionary[Double]): IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnum]
  }
  
  extension [Self <: IEnum](x: Self) {
    
    inline def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
