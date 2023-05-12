package typings.storybookCsf.mod

import typings.storybookCsf.storybookCsfStrings.`enum`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBEnumType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: `enum`
  
  var value: js.Array[String | Double]
}
object SBEnumType {
  
  inline def apply(value: js.Array[String | Double]): SBEnumType = {
    val __obj = js.Dynamic.literal(name = "enum", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBEnumType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SBEnumType] (val x: Self) extends AnyVal {
    
    inline def setName(value: `enum`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[String | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
