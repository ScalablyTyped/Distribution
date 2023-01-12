package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclOCB2ProgressiveProcessor extends StObject {
  
  def process(data: BitArray_): BitArray_
}
object SjclOCB2ProgressiveProcessor {
  
  inline def apply(process: BitArray_ => BitArray_): SjclOCB2ProgressiveProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SjclOCB2ProgressiveProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclOCB2ProgressiveProcessor] (val x: Self) extends AnyVal {
    
    inline def setProcess(value: BitArray_ => BitArray_): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
