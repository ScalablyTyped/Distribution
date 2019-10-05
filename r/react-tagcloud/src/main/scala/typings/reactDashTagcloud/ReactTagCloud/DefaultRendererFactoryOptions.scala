package typings.reactDashTagcloud.ReactTagCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultRendererFactoryOptions extends js.Object {
  var colorOptions: js.UndefOr[js.Any] = js.undefined
  var props: js.UndefOr[js.Any] = js.undefined
  var tagRenderer: js.UndefOr[js.Function] = js.undefined
}

object DefaultRendererFactoryOptions {
  @scala.inline
  def apply(colorOptions: js.Any = null, props: js.Any = null, tagRenderer: js.Function = null): DefaultRendererFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (colorOptions != null) __obj.updateDynamic("colorOptions")(colorOptions)
    if (props != null) __obj.updateDynamic("props")(props)
    if (tagRenderer != null) __obj.updateDynamic("tagRenderer")(tagRenderer)
    __obj.asInstanceOf[DefaultRendererFactoryOptions]
  }
}

