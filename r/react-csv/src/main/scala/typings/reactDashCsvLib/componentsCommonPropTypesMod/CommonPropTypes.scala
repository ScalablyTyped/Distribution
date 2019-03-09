package typings
package reactDashCsvLib.componentsCommonPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonPropTypes extends js.Object {
  var asyncOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var data: java.lang.String | Data
  var enclosingCharacter: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var onClick: js.UndefOr[SyncClickHandler | AsyncClickHandler] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var uFEFF: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonPropTypes {
  @scala.inline
  def apply(
    data: java.lang.String | Data,
    asyncOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    enclosingCharacter: java.lang.String = null,
    filename: java.lang.String = null,
    headers: Headers = null,
    onClick: SyncClickHandler | AsyncClickHandler = null,
    separator: java.lang.String = null,
    uFEFF: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonPropTypes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick)
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF)
    __obj.asInstanceOf[CommonPropTypes]
  }
}

