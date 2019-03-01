package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRenderedFeaturesParams extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var layers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object QueryRenderedFeaturesParams {
  @scala.inline
  def apply(filter: js.Array[_] = null, layers: js.Array[java.lang.String] = null): QueryRenderedFeaturesParams = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[QueryRenderedFeaturesParams]
  }
}

