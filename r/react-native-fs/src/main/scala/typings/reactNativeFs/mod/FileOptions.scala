package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOptions extends StObject {
  
  var NSFileProtectionKey: js.UndefOr[String] = js.undefined
}
object FileOptions {
  
  inline def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  extension [Self <: FileOptions](x: Self) {
    
    inline def setNSFileProtectionKey(value: String): Self = StObject.set(x, "NSFileProtectionKey", value.asInstanceOf[js.Any])
    
    inline def setNSFileProtectionKeyUndefined: Self = StObject.set(x, "NSFileProtectionKey", js.undefined)
  }
}
