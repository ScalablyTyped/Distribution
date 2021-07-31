package typings.rcFieldForm.interfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callbacks[Values] extends StObject {
  
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.undefined
  
  var onFinish: js.UndefOr[js.Function1[/* values */ Values, Unit]] = js.undefined
  
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity[Values], Unit]] = js.undefined
  
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ js.Any, /* values */ Values, Unit]] = js.undefined
}
object Callbacks {
  
  @scala.inline
  def apply[Values](): Callbacks[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks[Values]]
  }
  
  @scala.inline
  implicit class CallbacksMutableBuilder[Self <: Callbacks[?], Values] (val x: Self & Callbacks[Values]) extends AnyVal {
    
    @scala.inline
    def setOnFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit): Self = StObject.set(x, "onFieldsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFieldsChangeUndefined: Self = StObject.set(x, "onFieldsChange", js.undefined)
    
    @scala.inline
    def setOnFinish(value: /* values */ Values => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFinishFailed(value: /* errorInfo */ ValidateErrorEntity[Values] => Unit): Self = StObject.set(x, "onFinishFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFinishFailedUndefined: Self = StObject.set(x, "onFinishFailed", js.undefined)
    
    @scala.inline
    def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    @scala.inline
    def setOnValuesChange(value: (/* changedValues */ js.Any, /* values */ Values) => Unit): Self = StObject.set(x, "onValuesChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValuesChangeUndefined: Self = StObject.set(x, "onValuesChange", js.undefined)
  }
}
