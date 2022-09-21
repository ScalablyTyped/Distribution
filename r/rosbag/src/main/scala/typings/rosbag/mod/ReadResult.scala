package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadResult[T] extends StObject {
  
  var chunkOffset: Double
  
  var data: Buffer
  
  var message: T
  
  var timestamp: Time
  
  var topic: String
  
  var totalChunks: Double
}
object ReadResult {
  
  inline def apply[T](chunkOffset: Double, data: Buffer, message: T, timestamp: Time, topic: String, totalChunks: Double): ReadResult[T] = {
    val __obj = js.Dynamic.literal(chunkOffset = chunkOffset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], totalChunks = totalChunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResult[T]]
  }
  
  extension [Self <: ReadResult[?], T](x: Self & ReadResult[T]) {
    
    inline def setChunkOffset(value: Double): Self = StObject.set(x, "chunkOffset", value.asInstanceOf[js.Any])
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: T): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Time): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTotalChunks(value: Double): Self = StObject.set(x, "totalChunks", value.asInstanceOf[js.Any])
  }
}
