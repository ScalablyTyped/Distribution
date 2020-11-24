package typings.staleLruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions[K, V] extends js.Object {
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.native
  
  var staleWhileRevalidate: js.UndefOr[Double] = js.native
}
object SetOptions {
  
  @scala.inline
  def apply[K, V](): SetOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions[K, V]]
  }
  
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions[_, _], K, V] (val x: Self with (SetOptions[K, V])) extends AnyVal {
    
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
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
