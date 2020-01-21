package typings.reactNavigationStack.headerBackButtonMod

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.reactNavigation.mod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderBackButton
  extends Component[Props, State, js.Any] {
  @JSName("context")
  var context_HeaderBackButton: ContextType[Context[SupportedThemes]] = js.native
  var getTitleText: js.Any = js.native
  var handleTextLayout: js.Any = js.native
  var maybeRenderTitle: js.Any = js.native
  var renderBackImage: js.Any = js.native
}

