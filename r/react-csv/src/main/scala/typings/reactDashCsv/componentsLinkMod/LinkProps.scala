package typings.reactDashCsv.componentsLinkMod

import typings.reactDashCsv.componentsCommonPropTypesMod.AsyncClickHandler
import typings.reactDashCsv.componentsCommonPropTypesMod.CommonPropTypes
import typings.reactDashCsv.componentsCommonPropTypesMod.Data
import typings.reactDashCsv.componentsCommonPropTypesMod.Headers
import typings.reactDashCsv.componentsCommonPropTypesMod.SyncClickHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>, 'onClick'> ]: react.react.DetailedHTMLProps<react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>[P]} */ trait LinkProps extends CommonPropTypes

object LinkProps {
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
  ): LinkProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick)
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF)
    __obj.asInstanceOf[LinkProps]
  }
}

