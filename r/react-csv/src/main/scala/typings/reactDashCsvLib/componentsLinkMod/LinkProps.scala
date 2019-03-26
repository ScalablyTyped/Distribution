package typings
package reactDashCsvLib.componentsLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.DetailedHTMLProps<react.react.React.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>, 'onClick'> ]: react.react.React.DetailedHTMLProps<react.react.React.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>[P]} */ trait LinkProps
  extends reactDashCsvLib.componentsCommonPropTypesMod.CommonPropTypes

object LinkProps {
  @scala.inline
  def apply(
    data: java.lang.String | reactDashCsvLib.componentsCommonPropTypesMod.Data,
    asyncOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    enclosingCharacter: java.lang.String = null,
    filename: java.lang.String = null,
    headers: reactDashCsvLib.componentsCommonPropTypesMod.Headers = null,
    onClick: reactDashCsvLib.componentsCommonPropTypesMod.SyncClickHandler | reactDashCsvLib.componentsCommonPropTypesMod.AsyncClickHandler = null,
    separator: java.lang.String = null,
    uFEFF: js.UndefOr[scala.Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick)
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF)
    __obj.asInstanceOf[LinkProps]
  }
}

