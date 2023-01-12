package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastGetTransferOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var concurrency: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[
    js.Function3[/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.undefined
}
object FastGetTransferOptions {
  
  inline def apply(): FastGetTransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastGetTransferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastGetTransferOptions] (val x: Self) extends AnyVal {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setStep(value: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction3(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
