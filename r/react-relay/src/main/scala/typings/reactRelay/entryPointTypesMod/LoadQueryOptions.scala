package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  fetchPolicy :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadFetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   onQueryAstLoadTimeout :(): void | null | undefined}> */
@js.native
trait LoadQueryOptions extends js.Object {
  
  val fetchPolicy: js.UndefOr[PreloadFetchPolicy | Null] = js.native
  
  val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.native
  
  val onQueryAstLoadTimeout: js.UndefOr[js.Function0[Unit] | Null] = js.native
}
object LoadQueryOptions {
  
  @scala.inline
  def apply(): LoadQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadQueryOptions]
  }
  
  @scala.inline
  implicit class LoadQueryOptionsOps[Self <: LoadQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setFetchPolicy(value: PreloadFetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    
    @scala.inline
    def setFetchPolicyNull: Self = this.set("fetchPolicy", null)
    
    @scala.inline
    def setNetworkCacheConfig(value: CacheConfig): Self = this.set("networkCacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkCacheConfig: Self = this.set("networkCacheConfig", js.undefined)
    
    @scala.inline
    def setNetworkCacheConfigNull: Self = this.set("networkCacheConfig", null)
    
    @scala.inline
    def setOnQueryAstLoadTimeout(value: () => Unit): Self = this.set("onQueryAstLoadTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnQueryAstLoadTimeout: Self = this.set("onQueryAstLoadTimeout", js.undefined)
    
    @scala.inline
    def setOnQueryAstLoadTimeoutNull: Self = this.set("onQueryAstLoadTimeout", null)
  }
}
