package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  environmentProviderOptions ? :TEnvironmentProviderOptions | null,   options ? :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadOptions | null,   parameters  :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadableConcreteRequest<TQuery>,   variables  :TQuery['variables']}> */
trait ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends js.Object {
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions] = js.undefined
  val options: js.UndefOr[PreloadOptions] = js.undefined
  val parameters: PreloadableConcreteRequest[TQuery]
  val variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
}

object ThinQueryParams {
  @scala.inline
  def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    parameters: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    environmentProviderOptions: TEnvironmentProviderOptions = null,
    options: PreloadOptions = null
  ): ThinQueryParams[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (environmentProviderOptions != null) __obj.updateDynamic("environmentProviderOptions")(environmentProviderOptions.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinQueryParams[TQuery, TEnvironmentProviderOptions]]
  }
}

