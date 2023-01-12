package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferOptions extends StObject {
  
  var pipeOptions: js.UndefOr[PipeOptions] = js.undefined
  
  var readStreamOptions: js.UndefOr[ReadStreamOptions] = js.undefined
  
  var writeStreamOptions: js.UndefOr[WriteStreamOptions] = js.undefined
}
object TransferOptions {
  
  inline def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferOptions] (val x: Self) extends AnyVal {
    
    inline def setPipeOptions(value: PipeOptions): Self = StObject.set(x, "pipeOptions", value.asInstanceOf[js.Any])
    
    inline def setPipeOptionsUndefined: Self = StObject.set(x, "pipeOptions", js.undefined)
    
    inline def setReadStreamOptions(value: ReadStreamOptions): Self = StObject.set(x, "readStreamOptions", value.asInstanceOf[js.Any])
    
    inline def setReadStreamOptionsUndefined: Self = StObject.set(x, "readStreamOptions", js.undefined)
    
    inline def setWriteStreamOptions(value: WriteStreamOptions): Self = StObject.set(x, "writeStreamOptions", value.asInstanceOf[js.Any])
    
    inline def setWriteStreamOptionsUndefined: Self = StObject.set(x, "writeStreamOptions", js.undefined)
  }
}
