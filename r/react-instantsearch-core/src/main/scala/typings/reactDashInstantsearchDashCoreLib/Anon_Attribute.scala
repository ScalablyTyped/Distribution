package typings
package reactDashInstantsearchDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute[TDoc] extends js.Object {
  var attribute: java.lang.String
  var highlightProperty: java.lang.String
  var hit: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.Hit[TDoc]
  var postTag: js.UndefOr[java.lang.String] = js.undefined
  var preTag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Attribute {
  @scala.inline
  def apply[TDoc](
    attribute: java.lang.String,
    highlightProperty: java.lang.String,
    hit: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.Hit[TDoc],
    postTag: java.lang.String = null,
    preTag: java.lang.String = null
  ): Anon_Attribute[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute, highlightProperty = highlightProperty, hit = hit.asInstanceOf[js.Any])
    if (postTag != null) __obj.updateDynamic("postTag")(postTag)
    if (preTag != null) __obj.updateDynamic("preTag")(preTag)
    __obj.asInstanceOf[Anon_Attribute[TDoc]]
  }
}

