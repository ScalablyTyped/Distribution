package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamespace
  extends StObject
     with AnyNestedObject {
  
  /** Nested object descriptors */
  var nested: js.UndefOr[StringDictionary[AnyNestedObject]] = js.undefined
  
  /** Namespace options */
  var options: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object INamespace {
  
  inline def apply(): INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INamespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INamespace] (val x: Self) extends AnyVal {
    
    inline def setNested(value: StringDictionary[AnyNestedObject]): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
