package typings
package reactDashWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashWindowMod {
  type GridItemKeySelector = js.Function1[/* params */ reactDashWindowLib.Anon_ColumnIndex, reactLib.reactMod.Key]
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, reactLib.reactMod.Key]
  type ReactElementType = reactLib.reactMod.FunctionComponent[js.Any] | (reactLib.reactMod.ComponentClass[js.Any, reactLib.reactMod.ComponentState]) | java.lang.String
}
