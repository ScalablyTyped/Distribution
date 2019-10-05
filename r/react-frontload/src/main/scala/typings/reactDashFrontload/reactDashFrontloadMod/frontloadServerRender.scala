package typings.reactDashFrontload.reactDashFrontloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-frontload", "frontloadServerRender")
@js.native
object frontloadServerRender extends js.Object {
  def apply(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String]): js.Promise[String] = js.native
  def apply(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String], withLogging: Boolean): js.Promise[String] = js.native
}

