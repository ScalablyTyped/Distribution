package typings.properLockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckOptions extends js.Object {
  
   // default: true
  var fs: js.UndefOr[js.Any] = js.native
  
   // default: graceful-fs
  var lockfilePath: js.UndefOr[String] = js.native
  
   // default: 10000
  var realpath: js.UndefOr[Boolean] = js.native
  
  var stale: js.UndefOr[Double] = js.native
}
object CheckOptions {
  
  @scala.inline
  def apply(): CheckOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckOptions]
  }
  
  @scala.inline
  implicit class CheckOptionsOps[Self <: CheckOptions] (val x: Self) extends AnyVal {
    
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
    def setFs(value: js.Any): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setLockfilePath(value: String): Self = this.set("lockfilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockfilePath: Self = this.set("lockfilePath", js.undefined)
    
    @scala.inline
    def setRealpath(value: Boolean): Self = this.set("realpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
    
    @scala.inline
    def setStale(value: Double): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
  }
}
