package typings.rcFieldForm.interfaceMod

import typings.react.mod.ReactElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseRule extends StObject {
  
  var `enum`: js.UndefOr[js.Array[StoreValue]] = js.undefined
  
  var len: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String | ReactElement] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var pattern: js.UndefOr[RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var transform: js.UndefOr[js.Function1[/* value */ StoreValue, StoreValue]] = js.undefined
  
  var `type`: js.UndefOr[RuleType] = js.undefined
  
  /** Customize rule level `validateTrigger`. Must be subset of Field `validateTrigger` */
  var validateTrigger: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var whitespace: js.UndefOr[Boolean] = js.undefined
}
object BaseRule {
  
  inline def apply(): BaseRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRule]
  }
  
  extension [Self <: BaseRule](x: Self) {
    
    inline def setEnum(value: js.Array[StoreValue]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: StoreValue*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTransform(value: /* value */ StoreValue => StoreValue): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidateTrigger(value: String | js.Array[String]): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
    
    inline def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
    
    inline def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
    
    inline def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
