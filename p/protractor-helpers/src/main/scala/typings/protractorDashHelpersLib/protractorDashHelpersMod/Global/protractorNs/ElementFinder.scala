package typings
package protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementFinder extends js.Object {
  @JSName("$data")
  def $data(hook: java.lang.String): ElementFinder
}

object ElementFinder {
  @scala.inline
  def apply($data: js.Function1[java.lang.String, ElementFinder]): ElementFinder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$data")($data)
    __obj.asInstanceOf[ElementFinder]
  }
}

