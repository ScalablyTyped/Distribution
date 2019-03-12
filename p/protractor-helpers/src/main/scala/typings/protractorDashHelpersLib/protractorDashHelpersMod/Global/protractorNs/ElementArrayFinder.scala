package typings
package protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementArrayFinder extends js.Object {
  @JSName("$$data")
  def $$data(hook: java.lang.String): ElementArrayFinder
  def getByText(text: java.lang.String): ElementFinder
}

object ElementArrayFinder {
  @scala.inline
  def apply($$data: java.lang.String => ElementArrayFinder, getByText: java.lang.String => ElementFinder): ElementArrayFinder = {
    val __obj = js.Dynamic.literal($$data = js.Any.fromFunction1($$data), getByText = js.Any.fromFunction1(getByText))
  
    __obj.asInstanceOf[ElementArrayFinder]
  }
}

