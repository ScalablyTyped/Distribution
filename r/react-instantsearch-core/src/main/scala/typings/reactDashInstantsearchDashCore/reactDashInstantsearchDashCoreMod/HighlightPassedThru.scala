package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightPassedThru[TDoc] extends js.Object {
  var attribute: String
  var highlightProperty: js.UndefOr[String] = js.undefined
  var hit: Hit[TDoc]
}

object HighlightPassedThru {
  @scala.inline
  def apply[TDoc](attribute: String, hit: Hit[TDoc], highlightProperty: String = null): HighlightPassedThru[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute, hit = hit.asInstanceOf[js.Any])
    if (highlightProperty != null) __obj.updateDynamic("highlightProperty")(highlightProperty)
    __obj.asInstanceOf[HighlightPassedThru[TDoc]]
  }
}

