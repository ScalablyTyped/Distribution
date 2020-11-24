package typings.reactJss.mod

import typings.jss.mod.Classes
import typings.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-jss", "createUseStyles")
@js.native
object createUseStyles extends js.Object {
  
  def apply[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[Theme, C /* <: String */](styles: Styles[C]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  def apply[Theme, C /* <: String */](styles: Styles[C], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
}
