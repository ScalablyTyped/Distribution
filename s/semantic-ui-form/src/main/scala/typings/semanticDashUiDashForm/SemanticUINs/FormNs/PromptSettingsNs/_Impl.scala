package typings.semanticDashUiDashForm.SemanticUINs.FormNs.PromptSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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

object _Impl {
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
  ): _Impl = {
    val __obj = js.Dynamic.literal(checked = checked, contain = contain, containExactly = containExactly, creditCard = creditCard, decimal = decimal, different = different, doesntContain = doesntContain, doesntContainExactly = doesntContainExactly, email = email, empty = empty, exactCount = exactCount, exactLength = exactLength, integer = integer, is = is, isExactly = isExactly, length = length, maxCount = maxCount, maxLength = maxLength, minCount = minCount, minLength = minLength, not = not, notExactly = notExactly, number = number, regExp = regExp, url = url)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[_Impl]
  }
}

