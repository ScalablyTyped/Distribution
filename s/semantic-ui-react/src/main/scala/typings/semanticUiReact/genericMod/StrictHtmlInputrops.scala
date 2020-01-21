package typings.semanticUiReact.genericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictHtmlInputrops extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object StrictHtmlInputrops {
  @scala.inline
  def apply(`type`: String = null): StrictHtmlInputrops = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlInputrops]
  }
}

