package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.array
import typings.react.mod.ReactElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<rc-field-form.rc-field-form/es/interface.AggregationRule, 'type'> */
trait ArrayRule
  extends StObject
     with RuleObject {
  
  var defaultField: js.UndefOr[RuleObject] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[StoreValue]] = js.undefined
  
  var len: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String | ReactElement] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var pattern: js.UndefOr[RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var transform: js.UndefOr[js.Function1[/* value */ StoreValue, StoreValue]] = js.undefined
  
  var `type`: array
  
  var validateTrigger: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var validator: js.UndefOr[Validator] = js.undefined
  
  var whitespace: js.UndefOr[Boolean] = js.undefined
}
object ArrayRule {
  
  @scala.inline
  def apply(): ArrayRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArrayRule]
  }
  
  @scala.inline
  implicit class ArrayRuleMutableBuilder[Self <: ArrayRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultField(value: RuleObject): Self = StObject.set(x, "defaultField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFieldUndefined: Self = StObject.set(x, "defaultField", js.undefined)
    
    @scala.inline
    def setEnum(value: js.Array[StoreValue]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: StoreValue*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTransform(value: /* value */ StoreValue => StoreValue): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String]): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
    
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def setValidator(
      value: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => (js.Promise[Unit | js.Any]) | Unit
    ): Self = StObject.set(x, "validator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    @scala.inline
    def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
