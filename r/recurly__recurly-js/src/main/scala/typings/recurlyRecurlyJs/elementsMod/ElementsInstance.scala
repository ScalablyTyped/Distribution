package typings.recurlyRecurlyJs.elementsMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementsInstance extends Emitter[ElementsInstanceEvents] {
  
  def CardCvvElement(): IndividualElement = js.native
  def CardCvvElement(cardCvvElementOptions: IndividualElementOptions): IndividualElement = js.native
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#the-card-element|The Card Element}
    */
  def CardElement(): typings.recurlyRecurlyJs.elementsMod.CardElement = js.native
  def CardElement(cardElementOptions: CardElementOptions): typings.recurlyRecurlyJs.elementsMod.CardElement = js.native
  
  def CardMonthElement(): IndividualElement = js.native
  def CardMonthElement(cardMonthElementOptions: IndividualElementOptions): IndividualElement = js.native
  
  def CardNumberElement(): IndividualElement = js.native
  def CardNumberElement(cardNumberElementOptions: IndividualElementOptions): IndividualElement = js.native
  
  def CardYearElement(): IndividualElement = js.native
  def CardYearElement(cardYearElementOptions: IndividualElementOptions): IndividualElement = js.native
}
