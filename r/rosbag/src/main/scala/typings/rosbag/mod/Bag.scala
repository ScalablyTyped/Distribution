package typings.rosbag.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bag extends StObject {
  
  var chunkInfos: js.Array[ChunkInfo]
  
  var connections: NumberDictionary[Connection]
  
  var endTime: js.UndefOr[Time] = js.undefined
  
  var header: BagHeader
  
  /**
    * if the bag is manually created with the constructor, you must call `await open()` on the bag
    * generally this is called for you if you're using `const bag = await Bag.open()`
    */
  def open(): js.Promise[Unit]
  
  def readMessages(opts: ReadOptions, callback: js.Function1[/* msg */ ReadResult[Any], Unit]): js.Promise[Unit]
  
  var reader: BagReader
  
  var startTime: js.UndefOr[Time] = js.undefined
}
object Bag {
  
  inline def apply(
    chunkInfos: js.Array[ChunkInfo],
    connections: NumberDictionary[Connection],
    header: BagHeader,
    open: () => js.Promise[Unit],
    readMessages: (ReadOptions, js.Function1[/* msg */ ReadResult[Any], Unit]) => js.Promise[Unit],
    reader: BagReader
  ): Bag = {
    val __obj = js.Dynamic.literal(chunkInfos = chunkInfos.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), readMessages = js.Any.fromFunction2(readMessages), reader = reader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bag]
  }
  
  extension [Self <: Bag](x: Self) {
    
    inline def setChunkInfos(value: js.Array[ChunkInfo]): Self = StObject.set(x, "chunkInfos", value.asInstanceOf[js.Any])
    
    inline def setChunkInfosVarargs(value: ChunkInfo*): Self = StObject.set(x, "chunkInfos", js.Array(value*))
    
    inline def setConnections(value: NumberDictionary[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: Time): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setHeader(value: BagHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setReadMessages(value: (ReadOptions, js.Function1[/* msg */ ReadResult[Any], Unit]) => js.Promise[Unit]): Self = StObject.set(x, "readMessages", js.Any.fromFunction2(value))
    
    inline def setReader(value: BagReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
