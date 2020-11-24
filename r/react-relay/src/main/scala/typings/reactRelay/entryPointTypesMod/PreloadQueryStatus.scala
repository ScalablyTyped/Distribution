package typings.reactRelay.entryPointTypesMod

import typings.reactRelay.reactRelayStrings.cache
import typings.reactRelay.reactRelayStrings.network
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  cacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   source :'cache' | 'network',   fetchTime :number | null | undefined}> */
@js.native
trait PreloadQueryStatus extends js.Object {
  
  val cacheConfig: js.UndefOr[CacheConfig | Null] = js.native
  
  val fetchTime: js.UndefOr[Double | Null] = js.native
  
  val source: cache | network = js.native
}
object PreloadQueryStatus {
  
  @scala.inline
  def apply(source: cache | network): PreloadQueryStatus = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadQueryStatus]
  }
  
  @scala.inline
  implicit class PreloadQueryStatusOps[Self <: PreloadQueryStatus] (val x: Self) extends AnyVal {
    
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
    def setSource(value: cache | network): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheConfig(value: CacheConfig): Self = this.set("cacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheConfig: Self = this.set("cacheConfig", js.undefined)
    
    @scala.inline
    def setCacheConfigNull: Self = this.set("cacheConfig", null)
    
    @scala.inline
    def setFetchTime(value: Double): Self = this.set("fetchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchTime: Self = this.set("fetchTime", js.undefined)
    
    @scala.inline
    def setFetchTimeNull: Self = this.set("fetchTime", null)
  }
}
