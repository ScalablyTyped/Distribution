package typings.rjsfUtils.mod

import typings.rjsfUtils.rjsfUtilsStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties describing a Range specification in terms of attribute that can be added to the `HTML` `<input>` */
/* Inlined std.Omit<@rjsf/utils.@rjsf/utils.RangeSpecType, 'step'> & {  type :string,   step :number | 'any' | undefined,   autoComplete :std.HTMLInputElement['autocomplete'] | undefined} */
trait InputPropsType extends StObject {
  
  /** Specifies the `autoComplete` value for an <input> element */
  var autoComplete: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  /** Specifies the interval between legal numbers in an input field or "any" */
  var step: js.UndefOr[Double | any] = js.undefined
  
  /** Specifies the type of the <input> element */
  var `type`: String
}
object InputPropsType {
  
  inline def apply(`type`: String): InputPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPropsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPropsType] (val x: Self) extends AnyVal {
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setStep(value: Double | any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
