package typings.reactCreditCards.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactCreditCards.reactCreditCardsStrings.name
  - typings.reactCreditCards.reactCreditCardsStrings.number
  - typings.reactCreditCards.reactCreditCardsStrings.expiry
  - typings.reactCreditCards.reactCreditCardsStrings.cvc
*/
trait Focused extends js.Object

object Focused {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cvc: typings.reactCreditCards.reactCreditCardsStrings.cvc = this.cast("cvc")
  @scala.inline
  def expiry: typings.reactCreditCards.reactCreditCardsStrings.expiry = this.cast("expiry")
  @scala.inline
  def name: typings.reactCreditCards.reactCreditCardsStrings.name = this.cast("name")
  @scala.inline
  def number: typings.reactCreditCards.reactCreditCardsStrings.number = this.cast("number")
}

