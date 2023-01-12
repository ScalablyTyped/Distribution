package typings.ssh2SftpClient.mod

import typings.ssh2SftpClient.ssh2SftpClientStrings.a
import typings.ssh2SftpClient.ssh2SftpClientStrings.w
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteStreamOptions
  extends StObject
     with ModeOption {
  
  /**
    * @deprecated this option is ignored in v9.x. raw stream operations should use {@link createWriteStream} instead
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[Null | String] = js.undefined
  
  var flags: js.UndefOr[w | a] = js.undefined
}
object WriteStreamOptions {
  
  inline def apply(): WriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlags(value: w | a): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
  }
}
