package typings.reactFrontload.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-frontload", "frontloadConnect")
@js.native
object frontloadConnect extends js.Object {
  
  def apply(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]]): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = js.native
  def apply(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]], options: FrontloadConnectOptions): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = js.native
}
