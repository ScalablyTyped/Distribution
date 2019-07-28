package typings.protractorDashHelpers.protractorDashHelpersMod.Global.protractorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementFinder extends js.Object {
  @JSName("$data")
  def $data(hook: String): ElementFinder
}

object ElementFinder {
  @scala.inline
  def apply($data: String => ElementFinder): ElementFinder = {
    val __obj = js.Dynamic.literal($data = js.Any.fromFunction1($data))
  
    __obj.asInstanceOf[ElementFinder]
  }
}

