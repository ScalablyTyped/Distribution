package typings.reactDashWindow

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.Key
import typings.reactDashWindow.Anon_ColumnIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashWindowMod {
  type GridItemKeySelector = js.Function1[/* params */ Anon_ColumnIndex, Key]
  type ListItemKeySelector = js.Function2[/* index */ Double, /* data */ js.Any, Key]
  type ReactElementType = FunctionComponent[js.Any] | (ComponentClass[js.Any, ComponentState]) | String
}
