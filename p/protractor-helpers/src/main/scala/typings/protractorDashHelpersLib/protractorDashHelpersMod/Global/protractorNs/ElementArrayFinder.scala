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
  def apply(
    $$data: js.Function1[java.lang.String, ElementArrayFinder],
    getByText: js.Function1[java.lang.String, ElementFinder]
  ): ElementArrayFinder = {
    val __obj = js.Dynamic.literal($$data = $$data, getByText = getByText)
  
    __obj.asInstanceOf[ElementArrayFinder]
  }
}

