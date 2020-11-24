package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  parameters :relay-runtime.relay-runtime.ConcreteRequest | react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadableConcreteRequest<TQuery>,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   options :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadOptions | null | undefined,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined}> */
@js.native
trait ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */] extends js.Object {
  
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.native
  
  val options: js.UndefOr[PreloadOptions | Null] = js.native
  
  val parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery] = js.native
  
  val variables: VariablesOf[TQuery] = js.native
}
object ThinQueryParams {
  
  @scala.inline
  def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */](parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery], variables: VariablesOf[TQuery]): ThinQueryParams[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinQueryParams[TQuery, TEnvironmentProviderOptions]]
  }
  
  @scala.inline
  implicit class ThinQueryParamsOps[Self <: ThinQueryParams[_, _], TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, _]] */] (val x: Self with (ThinQueryParams[TQuery, TEnvironmentProviderOptions])) extends AnyVal {
    
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
    def setParameters(value: ConcreteRequest | PreloadableConcreteRequest[TQuery]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: VariablesOf[TQuery]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
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
