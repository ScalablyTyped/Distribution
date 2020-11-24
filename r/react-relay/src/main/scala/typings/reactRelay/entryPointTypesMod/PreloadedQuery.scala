package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  kind :'PreloadedQuery',   environment :relay-runtime.relay-runtime.IEnvironment,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined,   fetchKey :string | number,   fetchPolicy :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadFetchPolicy,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   id :string | null | undefined,   name :string,   source :relay-runtime.relay-runtime.Observable<relay-runtime.relay-runtime.GraphQLResponse> | null | undefined,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   dispose :relay-runtime.relay-runtime.DisposeFn,   isDisposed :boolean}> */
@js.native
trait PreloadedQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends js.Object {
  
  val dispose: DisposeFn = js.native
  
  val environment: Environment = js.native
  
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.native
  
  val fetchKey: String | Double = js.native
  
  val fetchPolicy: PreloadFetchPolicy = js.native
  
  val id: js.UndefOr[String | Null] = js.native
  
  val isDisposed: Boolean = js.native
  
  val kind: typings.reactRelay.reactRelayStrings.PreloadedQuery = js.native
  
  val name: String = js.native
  
  val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.native
  
  val source: js.UndefOr[Observable[GraphQLResponse] | Null] = js.native
  
  val variables: VariablesOf[TQuery] = js.native
}
object PreloadedQuery {
  
  @scala.inline
  def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    dispose: () => Unit,
    environment: Environment,
    fetchKey: String | Double,
    fetchPolicy: PreloadFetchPolicy,
    isDisposed: Boolean,
    kind: typings.reactRelay.reactRelayStrings.PreloadedQuery,
    name: String,
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), environment = environment.asInstanceOf[js.Any], fetchKey = fetchKey.asInstanceOf[js.Any], fetchPolicy = fetchPolicy.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  }
  
  @scala.inline
  implicit class PreloadedQueryOps[Self <: PreloadedQuery[_, _], TQuery /* <: OperationType */, TEnvironmentProviderOptions] (val x: Self with (PreloadedQuery[TQuery, TEnvironmentProviderOptions])) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchKey(value: String | Double): Self = this.set("fetchKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPolicy(value: PreloadFetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = this.set("isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typings.reactRelay.reactRelayStrings.PreloadedQuery): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: VariablesOf[TQuery]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = this.set("environmentProviderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentProviderOptions: Self = this.set("environmentProviderOptions", js.undefined)
    
    @scala.inline
    def setEnvironmentProviderOptionsNull: Self = this.set("environmentProviderOptions", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setNetworkCacheConfig(value: CacheConfig): Self = this.set("networkCacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkCacheConfig: Self = this.set("networkCacheConfig", js.undefined)
    
    @scala.inline
    def setNetworkCacheConfigNull: Self = this.set("networkCacheConfig", null)
    
    @scala.inline
    def setSource(value: Observable[GraphQLResponse]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
}
