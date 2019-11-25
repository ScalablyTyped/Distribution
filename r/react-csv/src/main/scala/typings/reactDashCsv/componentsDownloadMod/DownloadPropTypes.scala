package typings.reactDashCsv.componentsDownloadMod

import typings.reactDashCsv.componentsCommonPropTypesMod.AsyncClickHandler
import typings.reactDashCsv.componentsCommonPropTypesMod.CommonPropTypes
import typings.reactDashCsv.componentsCommonPropTypesMod.Data
import typings.reactDashCsv.componentsCommonPropTypesMod.Headers
import typings.reactDashCsv.componentsCommonPropTypesMod.SyncClickHandler
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
    if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick.asInstanceOf[js.Any])
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPropTypes]
  }
}

