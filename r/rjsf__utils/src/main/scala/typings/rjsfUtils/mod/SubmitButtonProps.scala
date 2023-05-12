package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that defines the props used by the Submit button */
trait SubmitButtonProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The uiSchema for this widget */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object SubmitButtonProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](registry: Registry[T, S, F]): SubmitButtonProps[T, S, F] = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitButtonProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubmitButtonProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (SubmitButtonProps[T, S, F])) extends AnyVal {
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
