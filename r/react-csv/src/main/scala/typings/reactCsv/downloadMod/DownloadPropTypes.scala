package typings.reactCsv.downloadMod

import typings.reactCsv.commonPropTypesMod.AsyncClickHandler
import typings.reactCsv.commonPropTypesMod.CommonPropTypes
import typings.reactCsv.commonPropTypesMod.Data
import typings.reactCsv.commonPropTypesMod.Headers
import typings.reactCsv.commonPropTypesMod.SyncClickHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPropTypes extends CommonPropTypes {
  var target: js.UndefOr[String] = js.undefined
}

object DownloadPropTypes {
  @scala.inline
  def apply(
    data: String | Data,
    asyncOnClick: js.UndefOr[Boolean] = js.undefined,
    enclosingCharacter: String = null,
    filename: String = null,
    headers: Headers = null,
    onClick: SyncClickHandler | AsyncClickHandler = null,
    separator: String = null,
    target: String = null,
    uFEFF: js.UndefOr[Boolean] = js.undefined
  ): DownloadPropTypes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick.get.asInstanceOf[js.Any])
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPropTypes]
  }
}

