package typings.semanticUiForm.SemanticUI.Form.PromptSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default '{name} must be checked'
    */
  var checked: String = js.native
  
  /**
    * @default '{name} cannot contain \'{ruleValue}\''
    */
  var contain: String = js.native
  
  /**
    * @default '{name} cannot contain exactly \'{ruleValue}\''
    */
  var containExactly: String = js.native
  
  /**
    * @default '{name} must be a valid credit card number'
    */
  var creditCard: String = js.native
  
  /**
    * @default '{name} must be a decimal number'
    */
  var decimal: String = js.native
  
  /**
    * @default '{name} must have a different value than {ruleValue} field'
    */
  var different: String = js.native
  
  /**
    * @default '{name} must contain  \'{ruleValue}\''
    */
  var doesntContain: String = js.native
  
  /**
    * @default '{name} must contain exactly \'{ruleValue}\''
    */
  var doesntContainExactly: String = js.native
  
  /**
    * @default '{name} must be a valid e-mail'
    */
  var email: String = js.native
  
  /**
    * @default '{name} must have a value'
    */
  var empty: String = js.native
  
  /**
    * @default '{name} must have exactly {ruleValue} choices'
    */
  var exactCount: String = js.native
  
  /**
    * @default '{name} must be exactly {ruleValue} characters'
    */
  var exactLength: String = js.native
  
  /**
    * @default '{name} must be an integer'
    */
  var integer: String = js.native
  
  /**
    * @default '{name} must be \'{ruleValue}\''
    */
  var is: String = js.native
  
  /**
    * @default '{name} must be exactly \'{ruleValue}\''
    */
  var isExactly: String = js.native
  
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var length: String = js.native
  
  /**
    * @default '{name} must match {ruleValue} field'
    */
  var `match`: String = js.native
  
  /**
    * @default '{name} must have {ruleValue} or less choices'
    */
  var maxCount: String = js.native
  
  /**
    * @default '{name} cannot be longer than {ruleValue} characters'
    */
  var maxLength: String = js.native
  
  /**
    * @default '{name} must have at least {ruleValue} choices'
    */
  var minCount: String = js.native
  
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var minLength: String = js.native
  
  /**
    * @default '{name} cannot be set to \'{ruleValue}\''
    */
  var not: String = js.native
  
  /**
    * @default '{name} cannot be set to exactly \'{ruleValue}\''
    */
  var notExactly: String = js.native
  
  /**
    * @default '{name} must be set to a number'
    */
  var number: String = js.native
  
  /**
    * @default '{name} is not formatted correctly'
    */
  var regExp: String = js.native
  
  /**
    * @default '{name} must be a valid url'
    */
  var url: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    checked: String,
    contain: String,
    containExactly: String,
    creditCard: String,
    decimal: String,
    different: String,
    doesntContain: String,
    doesntContainExactly: String,
    email: String,
    empty: String,
    exactCount: String,
    exactLength: String,
    integer: String,
    is: String,
    isExactly: String,
    length: String,
    `match`: String,
    maxCount: String,
    maxLength: String,
    minCount: String,
    minLength: String,
    not: String,
    notExactly: String,
    number: String,
    regExp: String,
    url: String
  ): Impl = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], containExactly = containExactly.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], different = different.asInstanceOf[js.Any], doesntContain = doesntContain.asInstanceOf[js.Any], doesntContainExactly = doesntContainExactly.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], exactCount = exactCount.asInstanceOf[js.Any], exactLength = exactLength.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], isExactly = isExactly.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minCount = minCount.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notExactly = notExactly.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: String): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContain(value: String): Self = this.set("contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainExactly(value: String): Self = this.set("containExactly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCard(value: String): Self = this.set("creditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifferent(value: String): Self = this.set("different", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoesntContain(value: String): Self = this.set("doesntContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoesntContainExactly(value: String): Self = this.set("doesntContainExactly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactCount(value: String): Self = this.set("exactCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactLength(value: String): Self = this.set("exactLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteger(value: String): Self = this.set("integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExactly(value: String): Self = this.set("isExactly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: String): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCount(value: String): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: String): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCount(value: String): Self = this.set("minCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: String): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot(value: String): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotExactly(value: String): Self = this.set("notExactly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: String): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
