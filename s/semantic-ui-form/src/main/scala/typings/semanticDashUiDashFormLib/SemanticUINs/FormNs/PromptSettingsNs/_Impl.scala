package typings
package semanticDashUiDashFormLib.SemanticUINs.FormNs.PromptSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '{name} must be checked'
    */
  var checked: java.lang.String
  /**
    * @default '{name} cannot contain \'{ruleValue}\''
    */
  var contain: java.lang.String
  /**
    * @default '{name} cannot contain exactly \'{ruleValue}\''
    */
  var containExactly: java.lang.String
  /**
    * @default '{name} must be a valid credit card number'
    */
  var creditCard: java.lang.String
  /**
    * @default '{name} must be a decimal number'
    */
  var decimal: java.lang.String
  /**
    * @default '{name} must have a different value than {ruleValue} field'
    */
  var different: java.lang.String
  /**
    * @default '{name} must contain  \'{ruleValue}\''
    */
  var doesntContain: java.lang.String
  /**
    * @default '{name} must contain exactly \'{ruleValue}\''
    */
  var doesntContainExactly: java.lang.String
  /**
    * @default '{name} must be a valid e-mail'
    */
  var email: java.lang.String
  /**
    * @default '{name} must have a value'
    */
  var empty: java.lang.String
  /**
    * @default '{name} must have exactly {ruleValue} choices'
    */
  var exactCount: java.lang.String
  /**
    * @default '{name} must be exactly {ruleValue} characters'
    */
  var exactLength: java.lang.String
  /**
    * @default '{name} must be an integer'
    */
  var integer: java.lang.String
  /**
    * @default '{name} must be \'{ruleValue}\''
    */
  var is: java.lang.String
  /**
    * @default '{name} must be exactly \'{ruleValue}\''
    */
  var isExactly: java.lang.String
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var length: java.lang.String
  /**
    * @default '{name} must match {ruleValue} field'
    */
  var `match`: java.lang.String
  /**
    * @default '{name} must have {ruleValue} or less choices'
    */
  var maxCount: java.lang.String
  /**
    * @default '{name} cannot be longer than {ruleValue} characters'
    */
  var maxLength: java.lang.String
  /**
    * @default '{name} must have at least {ruleValue} choices'
    */
  var minCount: java.lang.String
  /**
    * @default '{name} must be at least {ruleValue} characters'
    */
  var minLength: java.lang.String
  /**
    * @default '{name} cannot be set to \'{ruleValue}\''
    */
  var not: java.lang.String
  /**
    * @default '{name} cannot be set to exactly \'{ruleValue}\''
    */
  var notExactly: java.lang.String
  /**
    * @default '{name} must be set to a number'
    */
  var number: java.lang.String
  /**
    * @default '{name} is not formatted correctly'
    */
  var regExp: java.lang.String
  /**
    * @default '{name} must be a valid url'
    */
  var url: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    checked: java.lang.String,
    contain: java.lang.String,
    containExactly: java.lang.String,
    creditCard: java.lang.String,
    decimal: java.lang.String,
    different: java.lang.String,
    doesntContain: java.lang.String,
    doesntContainExactly: java.lang.String,
    email: java.lang.String,
    empty: java.lang.String,
    exactCount: java.lang.String,
    exactLength: java.lang.String,
    integer: java.lang.String,
    is: java.lang.String,
    isExactly: java.lang.String,
    length: java.lang.String,
    `match`: java.lang.String,
    maxCount: java.lang.String,
    maxLength: java.lang.String,
    minCount: java.lang.String,
    minLength: java.lang.String,
    not: java.lang.String,
    notExactly: java.lang.String,
    number: java.lang.String,
    regExp: java.lang.String,
    url: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(checked = checked, contain = contain, containExactly = containExactly, creditCard = creditCard, decimal = decimal, different = different, doesntContain = doesntContain, doesntContainExactly = doesntContainExactly, email = email, empty = empty, exactCount = exactCount, exactLength = exactLength, integer = integer, is = is, isExactly = isExactly, length = length, maxCount = maxCount, maxLength = maxLength, minCount = minCount, minLength = minLength, not = not, notExactly = notExactly, number = number, regExp = regExp, url = url)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[_Impl]
  }
}

