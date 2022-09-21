package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that defines the props used by the Submit button */
trait SubmitButtonProps[T, F] extends StObject {
  
  /** The uiSchema for this widget */
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object SubmitButtonProps {
  
  inline def apply[T, F](): SubmitButtonProps[T, F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitButtonProps[T, F]]
  }
  
  extension [Self <: SubmitButtonProps[?, ?], T, F](x: Self & (SubmitButtonProps[T, F])) {
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
