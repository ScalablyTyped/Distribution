package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.fullwidth
import typings.reactBulmaComponents.reactBulmaComponentsStrings.narrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Table ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/table/table.js
trait TableModifierProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[fullwidth | narrow] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
}

object TableModifierProps {
  @scala.inline
  def apply(
    bordered: js.UndefOr[Boolean] = js.undefined,
    size: fullwidth | narrow = null,
    striped: js.UndefOr[Boolean] = js.undefined
  ): TableModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableModifierProps]
  }
}

