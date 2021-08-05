package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.intersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBIntersectionType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: intersection
  
  var value: js.Array[SBType]
}
object SBIntersectionType {
  
  inline def apply(value: js.Array[SBType]): SBIntersectionType = {
    val __obj = js.Dynamic.literal(name = "intersection", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBIntersectionType]
  }
  
  extension [Self <: SBIntersectionType](x: Self) {
    
    inline def setName(value: intersection): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[SBType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: SBType*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
