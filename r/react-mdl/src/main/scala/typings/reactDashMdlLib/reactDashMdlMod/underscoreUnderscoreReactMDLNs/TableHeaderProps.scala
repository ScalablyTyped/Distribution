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

