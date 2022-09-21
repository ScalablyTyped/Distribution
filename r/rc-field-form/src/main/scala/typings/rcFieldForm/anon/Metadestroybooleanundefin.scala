package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.InternalNamePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-field-form.rc-field-form/es/interface.Meta & {  destroy :boolean | undefined} */
trait Metadestroybooleanundefin extends StObject {
  
  var destroy: js.UndefOr[scala.Boolean] = js.undefined
  
  var errors: js.Array[String]
  
  var name: InternalNamePath
  
  var touched: scala.Boolean
  
  var validating: scala.Boolean
  
  var warnings: js.Array[String]
}
object Metadestroybooleanundefin {
  
  inline def apply(
    errors: js.Array[String],
    name: InternalNamePath,
    touched: scala.Boolean,
    validating: scala.Boolean,
    warnings: js.Array[String]
  ): Metadestroybooleanundefin = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadestroybooleanundefin]
  }
  
  extension [Self <: Metadestroybooleanundefin](x: Self) {
    
    inline def setDestroy(value: scala.Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setTouched(value: scala.Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setValidating(value: scala.Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
