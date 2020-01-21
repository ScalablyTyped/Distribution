package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectNameProps extends js.Object {
  var dimmed: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
}

object ObjectNameProps {
  @scala.inline
  def apply(dimmed: js.UndefOr[Boolean] = js.undefined, name: String = null, styles: js.Object = null): ObjectNameProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dimmed)) __obj.updateDynamic("dimmed")(dimmed.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectNameProps]
  }
}

