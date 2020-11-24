package typings.staleLruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheOptions[K, V] extends js.Object {
  
  var getSize: js.UndefOr[js.Function2[/* value */ V, /* key */ K, Double]] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.native
  
  var staleWhileRevalidate: js.UndefOr[Double] = js.native
}
object CacheOptions {
  
  @scala.inline
  def apply[K, V](): CacheOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions[K, V]]
  }
  
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions[_, _], K, V] (val x: Self with (CacheOptions[K, V])) extends AnyVal {
    
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
    def setGetSize(value: (/* value */ V, /* key */ K) => Double): Self = this.set("getSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetSize: Self = this.set("getSize", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setRevalidate(value: (K, /* callback */ OptionsCallback[K, V]) => Unit): Self = this.set("revalidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRevalidate: Self = this.set("revalidate", js.undefined)
    
    @scala.inline
    def setStaleWhileRevalidate(value: Double): Self = this.set("staleWhileRevalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaleWhileRevalidate: Self = this.set("staleWhileRevalidate", js.undefined)
  }
}
