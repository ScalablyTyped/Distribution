package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadOptions
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadableConcreteRequest
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery /* <: OperationType */] extends js.Object {
  var environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.undefined
  var options: js.UndefOr[PreloadOptions | Null] = js.undefined
  var parameters: PreloadableConcreteRequest[TQuery]
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
}

object Anon_EnvironmentProviderOptions {
  @scala.inline
  def apply[TEnvironmentProviderOptions, TQuery /* <: OperationType */](
    parameters: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    environmentProviderOptions: TEnvironmentProviderOptions = null,
    options: PreloadOptions = null
  ): Anon_EnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery] = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (environmentProviderOptions != null) __obj.updateDynamic("environmentProviderOptions")(environmentProviderOptions.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery]]
  }
}

