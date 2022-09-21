package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var concurrency: js.UndefOr[Double] = js.undefined
  
  var fileSize: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[Double | String] = js.undefined
  
  var step: js.UndefOr[js.Function3[/* total */ Double, /* nb */ Double, /* fsize */ Double, Unit]] = js.undefined
}
object TransferOptions {
  
  inline def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  extension [Self <: TransferOptions](x: Self) {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setStep(value: (/* total */ Double, /* nb */ Double, /* fsize */ Double) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction3(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
