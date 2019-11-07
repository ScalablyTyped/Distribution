package typings.reactDashJss.reactDashJssMod

import typings.jss.jssMod.Style
import typings.jss.jssMod.StyleSheetFactoryOptions
import typings.reactDashJss.Anon_Index
import typings.reactDashJss.Anon_IndexName
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "createUseStyles")
@js.native
object createUseStyles extends js.Object {
  def apply[C /* <: String */](styles: Record[C, Style | String]): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
  def apply[C /* <: String */](styles: Record[C, Style | String], options: Anon_IndexName with StyleSheetFactoryOptions): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
  def apply[T, C /* <: String */](styles: js.Function1[/* theme */ T, Record[C, Style | String]]): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
  def apply[T, C /* <: String */](
    styles: js.Function1[/* theme */ T, Record[C, Style | String]],
    options: Anon_Index[T] with StyleSheetFactoryOptions
  ): js.Function1[/* data */ js.UndefOr[js.Any], Record[C, String]] = js.native
}

