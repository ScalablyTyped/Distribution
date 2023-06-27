package typings.remixRunRouter.anon

import typings.remixRunRouter.remixRunRouterStrings.idle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[TData] extends StObject {
  
  @JSName(" _hasFetcherDoneAnything ")
  var `Space_hasFetcherDoneAnything `: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[TData] = js.undefined
  
  var formAction: Unit
  
  var formData: Unit
  
  var formEncType: Unit
  
  var formMethod: Unit
  
  var json: Unit
  
  var state: idle
  
  var text: Unit
}
object Data {
  
  inline def apply[TData](formAction: Unit, formData: Unit, formEncType: Unit, formMethod: Unit, json: Unit, text: Unit): Data[TData] = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], state = "idle", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], TData] (val x: Self & Data[TData]) extends AnyVal {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFormAction(value: Unit): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: Unit): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: Unit): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormMethod(value: Unit): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setJson(value: Unit): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def `setSpace_hasFetcherDoneAnything `(value: Boolean): Self = StObject.set(x, " _hasFetcherDoneAnything ", value.asInstanceOf[js.Any])
    
    inline def `setSpace_hasFetcherDoneAnything Undefined`: Self = StObject.set(x, " _hasFetcherDoneAnything ", js.undefined)
    
    inline def setState(value: idle): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setText(value: Unit): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
