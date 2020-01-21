package typings.semanticUiForm.SemanticUI.Form.PromptSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '{name} must be checked'
    */
  var checked: String
  /**
    * @default '{name} cannot contain \'{ruleValue}\''
    */
  var contain: String
  /**
    * @default '{name} cannot contain exactly \'{ruleValue}\''
    */
  var containExactly: String
  /**
    * @default '{name} must be a valid credit card number'
    */
  var creditCard: String
  /**
    * @default '{name} must be a decimal number'
    */
  var decimal: String
  /**
    * @default '{name} must have a different value than {ruleValue} field'
    */
  var different: String
  /**
    * @default '{name} must contain  \'{ruleValue}\''
    */
  var doesntContain: String
  /**
    * @default '{name} must contain exactly \'{ruleValue}\''
    */
  var doesntContainExactly: String
  /**
    * @default '{name} must be a valid e-mail'
    */
  var email: String
  /**
    * @default '{name} must have a value'
    */
  var empty: String
  /**
    * @default '{name} must have exactly {ruleValue} choices'
    */
  var exactCount: String
  /**
    * @default '{name} must be exactly {ruleValue} characters'
    */
  var exactLength: String
  /**
    * @default '{name} must be an integer'
    */
  var integer: String
  /**
    * @default '{name} must be \'{ruleValue}\''
    */
  var is: String
  /**
    * @default '{name} must be exactly \'{ruleValue}\''
    */
  var isExactly: String
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var length: String
  /**
    * @default '{name} must match {ruleValue} field'
    */
  var `match`: String
  /**
    * @default '{name} must have {ruleValue} or less choices'
    */
  var maxCount: String
  /**
    * @default '{name} cannot be longer than {ruleValue} characters'
    */
  var maxLength: String
  /**
    * @default '{name} must have at least {ruleValue} choices'
    */
  var minCount: String
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var minLength: String
  /**
    * @default '{name} cannot be set to \'{ruleValue}\''
    */
  var not: String
  /**
    * @default '{name} cannot be set to exactly \'{ruleValue}\''
    */
  var notExactly: String
  /**
    * @default '{name} must be set to a number'
    */
  var number: String
  /**
    * @default '{name} is not formatted correctly'
    */
  var regExp: String
  /**
    * @default '{name} must be a valid url'
    */
  var url: String
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
}

