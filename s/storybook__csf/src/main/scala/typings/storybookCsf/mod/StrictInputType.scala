package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictInputType
  extends StObject
     with InputType {
  
  @JSName("name")
  var name_StrictInputType: String
  
  @JSName("type")
  var type_StrictInputType: js.UndefOr[SBType] = js.undefined
}
object StrictInputType {
  
  inline def apply(name: String): StrictInputType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictInputType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrictInputType] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: SBType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
