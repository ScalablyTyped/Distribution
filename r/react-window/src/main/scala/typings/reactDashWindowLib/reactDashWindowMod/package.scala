package typings
package reactDashWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashWindowMod {
  type GridItemKeySelector = js.Function1[/* params */ reactDashWindowLib.Anon_ColumnIndex, reactLib.reactMod.ReactNs.Key]
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, reactLib.reactMod.ReactNs.Key]
  type ReactElementType = reactLib.reactMod.ReactNs.FunctionComponent[js.Any] | (reactLib.reactMod.ReactNs.ComponentClass[js.Any, reactLib.reactMod.ReactNs.ComponentState]) | java.lang.String
}
