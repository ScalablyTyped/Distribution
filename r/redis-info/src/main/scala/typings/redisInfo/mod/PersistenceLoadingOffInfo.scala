package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceLoadingOffInfo extends js.Object {
  
  var loading: OFF = js.native
}
object PersistenceLoadingOffInfo {
  
  @scala.inline
  def apply(loading: OFF): PersistenceLoadingOffInfo = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceLoadingOffInfo]
  }
  
  @scala.inline
  implicit class PersistenceLoadingOffInfoOps[Self <: PersistenceLoadingOffInfo] (val x: Self) extends AnyVal {
    
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
    def setLoading(value: OFF): Self = this.set("loading", value.asInstanceOf[js.Any])
  }
}
