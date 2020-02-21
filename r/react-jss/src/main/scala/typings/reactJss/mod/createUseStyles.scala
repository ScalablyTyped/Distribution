package typings.reactJss.mod

import typings.jss.mod.Classes
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "createUseStyles")
@js.native
object createUseStyles extends js.Object {
  def apply[Theme /* <: js.Object */, C /* <: String */](styles: js.Function1[/* theme */ Theme, Record[C, _]]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[Theme /* <: js.Object */, C /* <: String */](styles: js.Function1[/* theme */ Theme, Record[C, _]], options: CreateUseStylesOptions): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[Theme /* <: js.Object */, C /* <: String */](styles: Record[C, _]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[Theme /* <: js.Object */, C /* <: String */](styles: Record[C, _], options: CreateUseStylesOptions): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
}

