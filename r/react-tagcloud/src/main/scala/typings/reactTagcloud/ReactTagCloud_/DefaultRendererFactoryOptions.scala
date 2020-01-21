package typings.reactTagcloud.ReactTagCloud_

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
    if (colorOptions != null) __obj.updateDynamic("colorOptions")(colorOptions.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (tagRenderer != null) __obj.updateDynamic("tagRenderer")(tagRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRendererFactoryOptions]
  }
}

