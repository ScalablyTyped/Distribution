package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MkdirOptions extends js.Object {
  
  // iOS only
  var NSFileProtectionKey: js.UndefOr[String] = js.native
  
  var NSURLIsExcludedFromBackupKey: js.UndefOr[Boolean] = js.native
}
object MkdirOptions {
  
  @scala.inline
  def apply(): MkdirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MkdirOptions]
  }
  
  @scala.inline
  implicit class MkdirOptionsOps[Self <: MkdirOptions] (val x: Self) extends AnyVal {
    
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
    def setNSFileProtectionKey(value: String): Self = this.set("NSFileProtectionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNSFileProtectionKey: Self = this.set("NSFileProtectionKey", js.undefined)
    
    @scala.inline
    def setNSURLIsExcludedFromBackupKey(value: Boolean): Self = this.set("NSURLIsExcludedFromBackupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNSURLIsExcludedFromBackupKey: Self = this.set("NSURLIsExcludedFromBackupKey", js.undefined)
  }
}
