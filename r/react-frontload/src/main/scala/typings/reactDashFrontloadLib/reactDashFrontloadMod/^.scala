package typings
package reactDashFrontloadLib.reactDashFrontloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-frontload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Frontload: reactLib.reactMod.ComponentClass[FrontloadProps, reactLib.reactMod.ComponentState] = js.native
  def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[scala.Unit]]): js.Function1[
    /* Component */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def frontloadConnect(
    frontload: js.Function1[/* props */ js.Any, js.Promise[scala.Unit]],
    options: FrontloadConnectOptions
  ): js.Function1[
    /* Component */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[scala.Boolean], java.lang.String]): js.Promise[java.lang.String] = js.native
  def frontloadServerRender(
    renderMarkup: js.Function1[/* dryRun */ js.UndefOr[scala.Boolean], java.lang.String],
    withLogging: scala.Boolean
  ): js.Promise[java.lang.String] = js.native
}

