package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadDirOptions
  extends StObject
     with DirOptions {
  
  var useFastput: js.UndefOr[Boolean] = js.undefined
}
object UploadDirOptions {
  
  inline def apply(): UploadDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadDirOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadDirOptions] (val x: Self) extends AnyVal {
    
    inline def setUseFastput(value: Boolean): Self = StObject.set(x, "useFastput", value.asInstanceOf[js.Any])
    
    inline def setUseFastputUndefined: Self = StObject.set(x, "useFastput", js.undefined)
  }
}
