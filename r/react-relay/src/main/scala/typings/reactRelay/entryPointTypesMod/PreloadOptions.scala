package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  fetchKey :string | number | undefined,   fetchPolicy :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadFetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined}> */
@js.native
trait PreloadOptions extends js.Object {
  
  val fetchKey: js.UndefOr[String | Double] = js.native
  
  val fetchPolicy: js.UndefOr[PreloadFetchPolicy | Null] = js.native
  
  val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.native
}
object PreloadOptions {
  
  @scala.inline
  def apply(): PreloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreloadOptions]
  }
  
  @scala.inline
  implicit class PreloadOptionsOps[Self <: PreloadOptions] (val x: Self) extends AnyVal {
    
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
    def setFetchKey(value: String | Double): Self = this.set("fetchKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchKey: Self = this.set("fetchKey", js.undefined)
    
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
  }
}
