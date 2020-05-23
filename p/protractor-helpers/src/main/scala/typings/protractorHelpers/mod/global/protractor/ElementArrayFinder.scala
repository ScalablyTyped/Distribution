package typings.protractorHelpers.mod.global.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementArrayFinder extends js.Object {
  @JSName("$$data")
  def DollarDollardata(hook: String): ElementArrayFinder
  def getByText(text: String): ElementFinder
}

object ElementArrayFinder {
  @scala.inline
  def apply(DollarDollardata: String => ElementArrayFinder, getByText: String => ElementFinder): ElementArrayFinder = {
    val __obj = js.Dynamic.literal(getByText = js.Any.fromFunction1(getByText))
    __obj.updateDynamic("$$data")(js.Any.fromFunction1(DollarDollardata))
    __obj.asInstanceOf[ElementArrayFinder]
  }
}

