package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadDirOptions
  extends StObject
     with DirOptions {
  
  var useFastget: js.UndefOr[Boolean] = js.undefined
}
object DownloadDirOptions {
  
  inline def apply(): DownloadDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDirOptions]
  }
  
  extension [Self <: DownloadDirOptions](x: Self) {
    
    inline def setUseFastget(value: Boolean): Self = StObject.set(x, "useFastget", value.asInstanceOf[js.Any])
    
    inline def setUseFastgetUndefined: Self = StObject.set(x, "useFastget", js.undefined)
  }
}
