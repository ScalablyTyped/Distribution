package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  environmentProviderOptions :TEnvironmentProviderOptions | null | undefined,   options :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadOptions | null | undefined,   parameters :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadableConcreteRequest<TQuery>,   variables :TQuery['variables']}> */
@js.native
trait ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends js.Object {
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.native
  val options: js.UndefOr[PreloadOptions | Null] = js.native
  val parameters: PreloadableConcreteRequest[TQuery] = js.native
  val variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any = js.native
}

object ThinQueryParams {
  @scala.inline
  def apply[/* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TQuery, TEnvironmentProviderOptions](
    parameters: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): ThinQueryParams[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinQueryParams[TQuery, TEnvironmentProviderOptions]]
  }
  @scala.inline
  implicit class ThinQueryParamsOps[Self <: ThinQueryParams[_, _], /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TQuery, TEnvironmentProviderOptions] (val x: Self with (ThinQueryParams[TQuery, TEnvironmentProviderOptions])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: PreloadableConcreteRequest[TQuery]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
    ): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = this.set("environmentProviderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentProviderOptions: Self = this.set("environmentProviderOptions", js.undefined)
    @scala.inline
    def setEnvironmentProviderOptionsNull: Self = this.set("environmentProviderOptions", null)
    @scala.inline
    def setOptions(value: PreloadOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
  }
  
}

