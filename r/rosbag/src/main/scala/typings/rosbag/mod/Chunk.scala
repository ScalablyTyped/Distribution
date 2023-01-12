package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk
  extends StObject
     with Record {
  
  var compression: String
  
  var data: Buffer
  
  var size: Double
}
object Chunk {
  
  inline def apply(
    compression: String,
    data: Buffer,
    dataOffset: Double,
    end: Double,
    length: Double,
    offset: Double,
    parseData: Buffer => Unit,
    size: Double
  ): Chunk = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
