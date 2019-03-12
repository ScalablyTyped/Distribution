package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightPassedThru[TDoc] extends js.Object {
  var attribute: java.lang.String
  var highlightProperty: js.UndefOr[java.lang.String] = js.undefined
  var hit: Hit[TDoc]
}

object HighlightPassedThru {
  @scala.inline
  def apply[TDoc](attribute: java.lang.String, hit: Hit[TDoc], highlightProperty: java.lang.String = null): HighlightPassedThru[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute, hit = hit.asInstanceOf[js.Any])
    if (highlightProperty != null) __obj.updateDynamic("highlightProperty")(highlightProperty)
    __obj.asInstanceOf[HighlightPassedThru[TDoc]]
  }
}

