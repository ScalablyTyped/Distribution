package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclOCB2ProgressiveProcessor extends StObject {
  
  def process(data: BitArray_): BitArray_ = js.native
}
object SjclOCB2ProgressiveProcessor {
  
  @scala.inline
  def apply(process: BitArray_ => BitArray_): SjclOCB2ProgressiveProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SjclOCB2ProgressiveProcessor]
  }
  
  @scala.inline
  implicit class SjclOCB2ProgressiveProcessorMutableBuilder[Self <: SjclOCB2ProgressiveProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcess(value: BitArray_ => BitArray_): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
