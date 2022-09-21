package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filelike extends StObject {
  
  /**
    * Reads buffer at specified offset and length then pass it on to callback function.
    * @param offset - The location in the buffer at which to start.
    * @param length - The number of bytes to read.
    * @param callback - Callback function accepting Buffer object.
    */
  def read(offset: Double, length: Double, callback: Callback[Buffer]): Unit
  
  /**
    * Getter method to retrieve file size.
    */
  def size(): Double
}
object Filelike {
  
  inline def apply(read: (Double, Double, Callback[Buffer]) => Unit, size: () => Double): Filelike = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction3(read), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Filelike]
  }
  
  extension [Self <: Filelike](x: Self) {
    
    inline def setRead(value: (Double, Double, Callback[Buffer]) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
