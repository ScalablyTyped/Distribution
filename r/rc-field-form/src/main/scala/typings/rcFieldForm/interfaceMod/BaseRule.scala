package typings.rcFieldForm.interfaceMod

import typings.react.mod.ReactElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRule extends StObject {
  
  var enum: js.UndefOr[js.Array[StoreValue]] = js.native
  
  var len: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String | ReactElement] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var pattern: js.UndefOr[RegExp] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var transform: js.UndefOr[js.Function1[/* value */ StoreValue, StoreValue]] = js.native
  
  var `type`: js.UndefOr[RuleType] = js.native
  
  /** Customize rule level `validateTrigger`. Must be subset of Field `validateTrigger` */
  var validateTrigger: js.UndefOr[String | js.Array[String]] = js.native
  
  var whitespace: js.UndefOr[Boolean] = js.native
}
object BaseRule {
  
  @scala.inline
  def apply(): BaseRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRule]
  }
  
  @scala.inline
  implicit class BaseRuleMutableBuilder[Self <: BaseRule] (val x: Self) extends AnyVal {
    
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
    def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String]): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
    
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
