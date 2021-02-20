package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MkdirOptions extends StObject {
  
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
  implicit class MkdirOptionsMutableBuilder[Self <: MkdirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNSFileProtectionKey(value: String): Self = StObject.set(x, "NSFileProtectionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNSFileProtectionKeyUndefined: Self = StObject.set(x, "NSFileProtectionKey", js.undefined)
    
    @scala.inline
    def setNSURLIsExcludedFromBackupKey(value: Boolean): Self = StObject.set(x, "NSURLIsExcludedFromBackupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNSURLIsExcludedFromBackupKeyUndefined: Self = StObject.set(x, "NSURLIsExcludedFromBackupKey", js.undefined)
  }
}
