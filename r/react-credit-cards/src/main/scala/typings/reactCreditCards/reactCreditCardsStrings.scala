package typings.reactCreditCards

import typings.reactCreditCards.mod.Focused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactCreditCardsStrings {
  @js.native
  sealed trait cvc extends Focused
  
  @js.native
  sealed trait expiry extends Focused
  
  @js.native
  sealed trait name extends Focused
  
  @js.native
  sealed trait number extends Focused
  
  @scala.inline
  def cvc: cvc = "cvc".asInstanceOf[cvc]
  @scala.inline
  def expiry: expiry = "expiry".asInstanceOf[expiry]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
}

