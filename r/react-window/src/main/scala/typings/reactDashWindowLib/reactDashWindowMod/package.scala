package typings
package reactDashWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashWindowMod {
  type Align = reactDashWindowLib.reactDashWindowLibStrings.auto | reactDashWindowLib.reactDashWindowLibStrings.center | reactDashWindowLib.reactDashWindowLibStrings.end | reactDashWindowLib.reactDashWindowLibStrings.start
  type Direction = reactDashWindowLib.reactDashWindowLibStrings.vertical | reactDashWindowLib.reactDashWindowLibStrings.horizontal
  type GridItemKeySelector = js.Function1[/* params */ reactDashWindowLib.Anon_ColumnIndex, reactLib.reactMod.ReactNs.Key]
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, reactLib.reactMod.ReactNs.Key]
  type ReactElementType = reactLib.reactMod.ReactNs.FunctionComponent[js.Any] | (reactLib.reactMod.ReactNs.ComponentClass[js.Any, reactLib.reactMod.ReactNs.ComponentState]) | java.lang.String
  type ScrollDirection = reactDashWindowLib.reactDashWindowLibStrings.forward | reactDashWindowLib.reactDashWindowLibStrings.backward
}
