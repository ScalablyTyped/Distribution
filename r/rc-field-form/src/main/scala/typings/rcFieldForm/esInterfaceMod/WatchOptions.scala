package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchOptions[Form /* <: FormInstance[Any] */] extends StObject {
  
  var form: js.UndefOr[Form] = js.undefined
  
  var preserve: js.UndefOr[Boolean] = js.undefined
}
object WatchOptions {
  
  inline def apply[Form /* <: FormInstance[Any] */](): WatchOptions[Form] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions[Form]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchOptions[?], Form /* <: FormInstance[Any] */] (val x: Self & WatchOptions[Form]) extends AnyVal {
    
    inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    
    inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
  }
}
