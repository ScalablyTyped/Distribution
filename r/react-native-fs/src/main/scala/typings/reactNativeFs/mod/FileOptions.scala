package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOptions extends StObject {
  
  var NSFileProtectionKey: js.UndefOr[String] = js.undefined
}
object FileOptions {
  
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  @scala.inline
  implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNSFileProtectionKey(value: String): Self = StObject.set(x, "NSFileProtectionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNSFileProtectionKeyUndefined: Self = StObject.set(x, "NSFileProtectionKey", js.undefined)
  }
}
