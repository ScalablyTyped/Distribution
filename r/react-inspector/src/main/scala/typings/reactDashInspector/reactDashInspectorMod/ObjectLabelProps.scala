package typings.reactDashInspector.reactDashInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectLabelProps extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var isNonenumerable: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ObjectLabelProps {
  @scala.inline
  def apply(data: js.Any = null, isNonenumerable: js.UndefOr[Boolean] = js.undefined, name: String = null): ObjectLabelProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(isNonenumerable)) __obj.updateDynamic("isNonenumerable")(isNonenumerable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLabelProps]
  }
}

