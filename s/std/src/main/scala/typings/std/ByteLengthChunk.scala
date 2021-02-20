package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteLengthChunk extends StObject {
  
  var byteLength: js.UndefOr[Double] = js.native
}
object ByteLengthChunk {
  
  @scala.inline
  def apply(): ByteLengthChunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteLengthChunk]
  }
  
  @scala.inline
  implicit class ByteLengthChunkMutableBuilder[Self <: ByteLengthChunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteLengthUndefined: Self = StObject.set(x, "byteLength", js.undefined)
  }
}
