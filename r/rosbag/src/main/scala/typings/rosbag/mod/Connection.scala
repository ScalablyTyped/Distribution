package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection
  extends StObject
     with Record {
  
  var callerid: js.UndefOr[String] = js.undefined
  
  var conn: Double
  
  var latching: js.UndefOr[Boolean] = js.undefined
  
  var md5sum: js.UndefOr[String] = js.undefined
  
  var messageDefinition: String
  
  var reader: js.UndefOr[MessageReader] = js.undefined
  
  var topic: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Connection {
  
  inline def apply(
    conn: Double,
    dataOffset: Double,
    end: Double,
    length: Double,
    messageDefinition: String,
    offset: Double,
    parseData: Buffer => Unit,
    topic: String
  ): Connection = {
    val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], messageDefinition = messageDefinition.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData), topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setCallerid(value: String): Self = StObject.set(x, "callerid", value.asInstanceOf[js.Any])
    
    inline def setCalleridUndefined: Self = StObject.set(x, "callerid", js.undefined)
    
    inline def setConn(value: Double): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
    
    inline def setLatching(value: Boolean): Self = StObject.set(x, "latching", value.asInstanceOf[js.Any])
    
    inline def setLatchingUndefined: Self = StObject.set(x, "latching", js.undefined)
    
    inline def setMd5sum(value: String): Self = StObject.set(x, "md5sum", value.asInstanceOf[js.Any])
    
    inline def setMd5sumUndefined: Self = StObject.set(x, "md5sum", js.undefined)
    
    inline def setMessageDefinition(value: String): Self = StObject.set(x, "messageDefinition", value.asInstanceOf[js.Any])
    
    inline def setReader(value: MessageReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
