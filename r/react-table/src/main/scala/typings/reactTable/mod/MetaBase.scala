package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaBase[D /* <: js.Object */] extends StObject {
  
  var instance: TableInstance[D]
  
  var userProps: js.Any
}
object MetaBase {
  
  inline def apply[D /* <: js.Object */](instance: TableInstance[D], userProps: js.Any): MetaBase[D] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], userProps = userProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaBase[D]]
  }
  
  extension [Self <: MetaBase[?], D /* <: js.Object */](x: Self & MetaBase[D]) {
    
    inline def setInstance(value: TableInstance[D]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setUserProps(value: js.Any): Self = StObject.set(x, "userProps", value.asInstanceOf[js.Any])
  }
}
