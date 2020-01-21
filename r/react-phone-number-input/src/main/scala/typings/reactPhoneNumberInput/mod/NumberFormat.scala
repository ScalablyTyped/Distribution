package typings.reactPhoneNumberInput.mod

import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.International_
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.National_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.NATIONAL
  - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.National_
  - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.INTERNATIONAL
  - typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.International_
*/
trait NumberFormat extends js.Object

object NumberFormat {
  @scala.inline
  def INTERNATIONAL: typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.INTERNATIONAL = this.cast("INTERNATIONAL")
  @scala.inline
  def International: International_ = this.cast("International")
  @scala.inline
  def NATIONAL: typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.NATIONAL = this.cast("NATIONAL")
  @scala.inline
  def National: National_ = this.cast("National")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

