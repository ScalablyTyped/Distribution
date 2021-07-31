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
  
  @scala.inline
  def apply(chunkSize: Double): FastOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastOptions]
  }
  
  @scala.inline
  implicit class FastOptionsMutableBuilder[Self <: FastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    @scala.inline
    def setStep(value: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
