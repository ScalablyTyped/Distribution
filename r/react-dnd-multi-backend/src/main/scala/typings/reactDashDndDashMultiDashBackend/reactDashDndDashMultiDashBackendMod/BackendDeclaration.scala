package typings.reactDashDndDashMultiDashBackend.reactDashDndDashMultiDashBackendMod

import typings.dndDashCore.libInterfacesMod.BackendFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendDeclaration extends js.Object {
  /**
    * Backend - e.g. the one provided by react-dnd-html5-backend.
    */
  var backend: BackendFactory
  /**
    * Parameters to the backend
    */
  var options: js.UndefOr[js.Object] = js.undefined
  /**
    * Flag to indicate that this backend needs to have a custom preview generated. This is mainly
    * used for backends such as the react-dnd-touch-backend, where there is no default preview
    * available.
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  /**
    * The transition that this backend should be used for.
    */
  var transition: js.UndefOr[Transition] = js.undefined
}

object BackendDeclaration {
  @scala.inline
  def apply(
    backend: BackendFactory,
    options: js.Object = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    transition: Transition = null
  ): BackendDeclaration = {
    val __obj = js.Dynamic.literal(backend = backend)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[BackendDeclaration]
  }
}

