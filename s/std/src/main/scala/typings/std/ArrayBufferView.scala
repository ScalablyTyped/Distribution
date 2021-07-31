package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayBufferView
  extends StObject
     with BufferSource {
  
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  var buffer: ArrayBufferLike
  
  /**
    * The length in bytes of the array.
    */
  var byteLength: Double
  
  /**
    * The offset in bytes of the array.
    */
  var byteOffset: Double
}
object ArrayBufferView {
  
  @scala.inline
  def apply(buffer: ArrayBufferLike, byteLength: Double, byteOffset: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
  
  @scala.inline
  implicit class ArrayBufferViewMutableBuilder[Self <: ArrayBufferView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
  }
}
