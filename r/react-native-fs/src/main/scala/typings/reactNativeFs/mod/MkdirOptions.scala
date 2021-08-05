package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MkdirOptions extends StObject {
  
  // iOS only
  var NSFileProtectionKey: js.UndefOr[String] = js.undefined
  
  var NSURLIsExcludedFromBackupKey: js.UndefOr[Boolean] = js.undefined
}
object MkdirOptions {
  
  inline def apply(): MkdirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MkdirOptions]
  }
  
  extension [Self <: MkdirOptions](x: Self) {
    
    inline def setNSFileProtectionKey(value: String): Self = StObject.set(x, "NSFileProtectionKey", value.asInstanceOf[js.Any])
    
    inline def setNSFileProtectionKeyUndefined: Self = StObject.set(x, "NSFileProtectionKey", js.undefined)
    
    inline def setNSURLIsExcludedFromBackupKey(value: Boolean): Self = StObject.set(x, "NSURLIsExcludedFromBackupKey", value.asInstanceOf[js.Any])
    
    inline def setNSURLIsExcludedFromBackupKeyUndefined: Self = StObject.set(x, "NSURLIsExcludedFromBackupKey", js.undefined)
  }
}
