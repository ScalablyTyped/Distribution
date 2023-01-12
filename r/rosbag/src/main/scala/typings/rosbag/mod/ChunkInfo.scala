package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import typings.rosbag.anon.Conn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkInfo
  extends StObject
     with Record {
  
  var chunkPosition: Double
  
  var connections: js.Array[Conn]
  
  var count: Double
  
  var endTime: Time
  
  var nextChunk: js.UndefOr[ChunkInfo] = js.undefined
  
  var startTime: Time
  
  var ver: Double
}
object ChunkInfo {
  
  inline def apply(
    chunkPosition: Double,
    connections: js.Array[Conn],
    count: Double,
    dataOffset: Double,
    end: Double,
    endTime: Time,
    length: Double,
    offset: Double,
    parseData: Buffer => Unit,
    startTime: Time,
    ver: Double
  ): ChunkInfo = {
    val __obj = js.Dynamic.literal(chunkPosition = chunkPosition.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData), startTime = startTime.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkInfo] (val x: Self) extends AnyVal {
    
    inline def setChunkPosition(value: Double): Self = StObject.set(x, "chunkPosition", value.asInstanceOf[js.Any])
    
    inline def setConnections(value: js.Array[Conn]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsVarargs(value: Conn*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: Time): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setNextChunk(value: ChunkInfo): Self = StObject.set(x, "nextChunk", value.asInstanceOf[js.Any])
    
    inline def setNextChunkUndefined: Self = StObject.set(x, "nextChunk", js.undefined)
    
    inline def setStartTime(value: Time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setVer(value: Double): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
