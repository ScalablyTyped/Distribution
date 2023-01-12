package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaBase[D /* <: js.Object */] extends StObject {
  
  var instance: TableInstance[D]
  
  var userProps: Any
}
object MetaBase {
  
  inline def apply[D /* <: js.Object */](instance: TableInstance[D], userProps: Any): MetaBase[D] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], userProps = userProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaBase[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaBase[?], D /* <: js.Object */] (val x: Self & MetaBase[D]) extends AnyVal {
    
    inline def setInstance(value: TableInstance[D]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setUserProps(value: Any): Self = StObject.set(x, "userProps", value.asInstanceOf[js.Any])
  }
}
