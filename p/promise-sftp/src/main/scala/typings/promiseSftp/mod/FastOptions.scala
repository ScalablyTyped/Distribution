package typings.promiseSftp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for `PromiseSftp#fast{Get,Put}` */
trait FastOptions extends StObject {
  
  /**
    * Size of each read in bytes
    * @default 32768
    */
  var chunkSize: Double
  
  /**
    * Number of concurrent reads
    * @default 25
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  
  /** Called every time a part of a file is transferred */
  var step: js.UndefOr[
    js.Function3[/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.undefined
}
object FastOptions {
  
  inline def apply(chunkSize: Double): FastOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastOptions] (val x: Self) extends AnyVal {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setStep(value: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction3(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
