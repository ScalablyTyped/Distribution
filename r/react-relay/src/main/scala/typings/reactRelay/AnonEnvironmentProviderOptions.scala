package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.PreloadOptions
import typings.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery /* <: OperationType */] extends js.Object {
  var environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.undefined
  var options: js.UndefOr[PreloadOptions | Null] = js.undefined
  var parameters: PreloadableConcreteRequest[TQuery]
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
}

object AnonEnvironmentProviderOptions {
  @scala.inline
  def apply[TEnvironmentProviderOptions, TQuery /* <: OperationType */](
    parameters: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    environmentProviderOptions: TEnvironmentProviderOptions = null,
    options: PreloadOptions = null
  ): AnonEnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery] = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (environmentProviderOptions != null) __obj.updateDynamic("environmentProviderOptions")(environmentProviderOptions.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnvironmentProviderOptions[TEnvironmentProviderOptions, TQuery]]
  }
}

