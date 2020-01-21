package typings.reactCsv.commonPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonPropTypes extends js.Object {
  var asyncOnClick: js.UndefOr[Boolean] = js.undefined
  var data: String | Data
  var enclosingCharacter: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var onClick: js.UndefOr[SyncClickHandler | AsyncClickHandler] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var uFEFF: js.UndefOr[Boolean] = js.undefined
}

object CommonPropTypes {
  @scala.inline
  def apply(
    data: String | Data,
    asyncOnClick: js.UndefOr[Boolean] = js.undefined,
    enclosingCharacter: String = null,
    filename: String = null,
    headers: Headers = null,
    onClick: SyncClickHandler | AsyncClickHandler = null,
    separator: String = null,
    uFEFF: js.UndefOr[Boolean] = js.undefined
  ): CommonPropTypes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick.asInstanceOf[js.Any])
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPropTypes]
  }
}

