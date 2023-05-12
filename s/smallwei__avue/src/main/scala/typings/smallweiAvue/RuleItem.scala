package typings.smallweiAvue

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleItem extends StObject {
  
  var asyncValidator: js.UndefOr[
    js.Function5[
      /* rule */ InternalRuleItem, 
      /* value */ Value, 
      /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
      /* source */ Values, 
      /* options */ ValidateOption, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
  
  var defaultField: js.UndefOr[Rule] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[js.UndefOr[String | Double | Boolean | Null]]] = js.undefined
  
  var fields: js.UndefOr[Record[String, Rule]] = js.undefined
  
  var len: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String | (js.Function1[/* a */ js.UndefOr[String], String])] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[ValidateOption] = js.undefined
  
  var pattern: js.UndefOr[js.RegExp | String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var transform: js.UndefOr[js.Function1[/* value */ Value, Value]] = js.undefined
  
  var `type`: js.UndefOr[RuleType] = js.undefined
  
  var validator: js.UndefOr[
    js.Function5[
      /* rule */ InternalRuleItem, 
      /* value */ Value, 
      /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
      /* source */ Values, 
      /* options */ ValidateOption, 
      SyncValidateResult | Unit
    ]
  ] = js.undefined
  
  var whitespace: js.UndefOr[Boolean] = js.undefined
}
object RuleItem {
  
  inline def apply(): RuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleItem] (val x: Self) extends AnyVal {
    
    inline def setAsyncValidator(
      value: (/* rule */ InternalRuleItem, /* value */ Value, /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], /* source */ Values, /* options */ ValidateOption) => Unit | js.Promise[Unit]
    ): Self = StObject.set(x, "asyncValidator", js.Any.fromFunction5(value))
    
    inline def setAsyncValidatorUndefined: Self = StObject.set(x, "asyncValidator", js.undefined)
    
    inline def setDefaultField(value: Rule): Self = StObject.set(x, "defaultField", value.asInstanceOf[js.Any])
    
    inline def setDefaultFieldUndefined: Self = StObject.set(x, "defaultField", js.undefined)
    
    inline def setDefaultFieldVarargs(value: RuleItem*): Self = StObject.set(x, "defaultField", js.Array(value*))
    
    inline def setEnum(value: js.Array[js.UndefOr[String | Double | Boolean | Null]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: (js.UndefOr[String | Double | Boolean | Null])*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setFields(value: Record[String, Rule]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessage(value: String | (js.Function1[/* a */ js.UndefOr[String], String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* a */ js.UndefOr[String] => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOptions(value: ValidateOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPattern(value: js.RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTransform(value: /* value */ Value => Value): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidator(
      value: (/* rule */ InternalRuleItem, /* value */ Value, /* callback */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], /* source */ Values, /* options */ ValidateOption) => SyncValidateResult | Unit
    ): Self = StObject.set(x, "validator", js.Any.fromFunction5(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
