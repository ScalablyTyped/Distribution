package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with MDLDOMAttributes[TableHeader] {
  var cellFormatter: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* row */ js.Any, 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var name: java.lang.String
  var nosort: js.UndefOr[scala.Boolean] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[TableHeader, reactLib.NativeMouseEvent], 
      /* name */ java.lang.String, 
      _
    ]
  ] = js.undefined
  var sortFn: js.UndefOr[
    js.Function3[/* a */ js.Any, /* b */ js.Any, /* isAsc */ scala.Boolean, scala.Double]
  ] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    ClassAttributes: reactLib.reactMod.ReactNs.ClassAttributes[js.Any] = null,
    MDLDOMAttributes: MDLDOMAttributes[TableHeader] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    cellFormatter: js.Function3[
      /* value */ js.Any, 
      /* row */ js.Any, 
      /* index */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    nosort: js.UndefOr[scala.Boolean] = js.undefined,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[TableHeader, reactLib.NativeMouseEvent], 
      /* name */ java.lang.String, 
      _
    ] = null,
    sortFn: js.Function3[/* a */ js.Any, /* b */ js.Any, /* isAsc */ scala.Boolean, scala.Double] = null,
    title: java.lang.String = null,
    tooltip: reactLib.reactMod.ReactNs.ReactNode = null
  ): TableHeaderProps = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLDOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (cellFormatter != null) __obj.updateDynamic("cellFormatter")(cellFormatter)
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (sortFn != null) __obj.updateDynamic("sortFn")(sortFn)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderProps]
  }
}

