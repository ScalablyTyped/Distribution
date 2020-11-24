package typings.reReselect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSize extends js.Object {
  
  var cacheSize: Double = js.native
}
object CacheSize {
  
  @scala.inline
  def apply(cacheSize: Double): CacheSize = {
    val __obj = js.Dynamic.literal(cacheSize = cacheSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheSize]
  }
  
  @scala.inline
  implicit class CacheSizeOps[Self <: CacheSize] (val x: Self) extends AnyVal {
    
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
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
  }
}
