package typings.storybookCsf.mod

import typings.storybookCsf.storybookCsfStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBUnionType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: union
  
  var value: js.Array[SBType]
}
object SBUnionType {
  
  inline def apply(value: js.Array[SBType]): SBUnionType = {
    val __obj = js.Dynamic.literal(name = "union", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBUnionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SBUnionType] (val x: Self) extends AnyVal {
    
    inline def setName(value: union): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[SBType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: SBType*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
