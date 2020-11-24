package typings.rcFieldForm.interfaceMod

import typings.react.mod.ReactElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRule extends js.Object {
  
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
  implicit class BaseRuleOps[Self <: BaseRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnumVarargs(value: StoreValue*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[StoreValue]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setLen(value: Double): Self = this.set("len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLen: Self = this.set("len", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessage(value: String | ReactElement): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTransform(value: /* value */ StoreValue => StoreValue): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setType(value: RuleType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = this.set("validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String]): Self = this.set("validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateTrigger: Self = this.set("validateTrigger", js.undefined)
    
    @scala.inline
    def setWhitespace(value: Boolean): Self = this.set("whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitespace: Self = this.set("whitespace", js.undefined)
  }
}
