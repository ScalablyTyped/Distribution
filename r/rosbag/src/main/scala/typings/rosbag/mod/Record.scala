package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  var dataOffset: Double
  
  var end: Double
  
  var length: Double
  
  var offset: Double
  
  def parseData(_buffer: Buffer): Unit
}
object Record {
  
  inline def apply(dataOffset: Double, end: Double, length: Double, offset: Double, parseData: Buffer => Unit): Record = {
    val __obj = js.Dynamic.literal(dataOffset = dataOffset.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData))
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
    
    inline def setDataOffset(value: Double): Self = StObject.set(x, "dataOffset", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setParseData(value: Buffer => Unit): Self = StObject.set(x, "parseData", js.Any.fromFunction1(value))
  }
}
