package typings.protractorDashHelpers.protractorDashHelpersMod._Global_.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementArrayFinder extends js.Object {
  @JSName("$$data")
  def $$data(hook: String): ElementArrayFinder
  def getByText(text: String): ElementFinder
}

object ElementArrayFinder {
  @scala.inline
  def apply($$data: String => ElementArrayFinder, getByText: String => ElementFinder): ElementArrayFinder = {
    val __obj = js.Dynamic.literal($$data = js.Any.fromFunction1($$data), getByText = js.Any.fromFunction1(getByText))
  
    __obj.asInstanceOf[ElementArrayFinder]
  }
}

