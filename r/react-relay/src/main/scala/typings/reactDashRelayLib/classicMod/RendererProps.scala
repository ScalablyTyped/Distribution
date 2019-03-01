package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererProps extends js.Object {
  var Container: RelayContainerClass[_]
   // `QueryConfig` or `Relay.Route` that defines the query roots.
  var environment: Store
   // Relay container that defines fragments and the view to render.
  var forceFetch: js.UndefOr[scala.Boolean] = js.undefined
   //  Called to render when data requirements are being fulfilled.
  var onReadyStateChange: js.UndefOr[OnReadyStateChange] = js.undefined
   // Whether to send a server request regardless of data available on the client.
  var queryConfig: Route
   // An instance of `Relay.Environment` or any object that implements the `RelayEnvironment` interface.
  var render: js.UndefOr[RenderCallback] = js.undefined
}

object RendererProps {
  @scala.inline
  def apply(
    Container: RelayContainerClass[_],
    environment: Store,
    queryConfig: Route,
    forceFetch: js.UndefOr[scala.Boolean] = js.undefined,
    onReadyStateChange: OnReadyStateChange = null,
    render: RenderCallback = null
  ): RendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Container")(Container)
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("queryConfig")(queryConfig)
    if (!js.isUndefined(forceFetch)) __obj.updateDynamic("forceFetch")(forceFetch)
    if (onReadyStateChange != null) __obj.updateDynamic("onReadyStateChange")(onReadyStateChange)
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[RendererProps]
  }
}

