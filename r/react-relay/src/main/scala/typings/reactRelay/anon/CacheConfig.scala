package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheConfig extends js.Object {
  
  var cacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.native
  
  var fetchPolicy: js.UndefOr[typings.reactRelay.mod.FetchPolicy] = js.native
}
object CacheConfig {
  
  @scala.inline
  def apply(): CacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheConfig]
  }
  
  @scala.inline
  implicit class CacheConfigOps[Self <: CacheConfig] (val x: Self) extends AnyVal {
    
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
    def setCacheConfig(value: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = this.set("cacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheConfig: Self = this.set("cacheConfig", js.undefined)
    
    @scala.inline
    def setCacheConfigNull: Self = this.set("cacheConfig", null)
    
    @scala.inline
    def setFetchPolicy(value: typings.reactRelay.mod.FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
  }
}
