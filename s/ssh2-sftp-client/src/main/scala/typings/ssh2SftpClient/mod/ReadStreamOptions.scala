package typings.ssh2SftpClient.mod

import typings.ssh2SftpClient.ssh2SftpClientStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadStreamOptions
  extends StObject
     with ModeOption {
  
  /**
    * @deprecated this option is ignored in v9.x. raw stream operations should use {@link createReadStream} instead
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[Null | String] = js.undefined
  
  var flags: js.UndefOr[r] = js.undefined
  
  var handle: js.UndefOr[Null | String] = js.undefined
}
object ReadStreamOptions {
  
  inline def apply(): ReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadStreamOptions]
  }
  
  extension [Self <: ReadStreamOptions](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlags(value: r): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleNull: Self = StObject.set(x, "handle", null)
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
  }
}
