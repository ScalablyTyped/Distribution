package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import typings.rosbag.anon.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexData
  extends StObject
     with Record {
  
  var conn: Double
  
  var count: Double
  
  var indices: js.Array[Offset]
  
  var ver: Double
}
object IndexData {
  
  inline def apply(
    conn: Double,
    count: Double,
    dataOffset: Double,
    end: Double,
    indices: js.Array[Offset],
    length: Double,
    offset: Double,
    parseData: Buffer => Unit,
    ver: Double
  ): IndexData = {
    val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData), ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexData]
  }
  
  extension [Self <: IndexData](x: Self) {
    
    inline def setConn(value: Double): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[Offset]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Offset*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setVer(value: Double): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
