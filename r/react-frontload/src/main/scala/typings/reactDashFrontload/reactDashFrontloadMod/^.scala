package typings.reactDashFrontload.reactDashFrontloadMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-frontload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Frontload: ComponentClass[FrontloadProps, ComponentState] = js.native
  def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]]): js.Function1[/* Component */ ComponentType[_], ComponentType[_]] = js.native
  def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]], options: FrontloadConnectOptions): js.Function1[/* Component */ ComponentType[_], ComponentType[_]] = js.native
  def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String]): js.Promise[String] = js.native
  def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String], withLogging: Boolean): js.Promise[String] = js.native
}

