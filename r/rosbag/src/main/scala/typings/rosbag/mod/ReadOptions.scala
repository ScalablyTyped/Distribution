package typings.rosbag.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOptions extends StObject {
  
  var decompress: js.UndefOr[Decompress] = js.undefined
  
  var endTime: js.UndefOr[Time] = js.undefined
  
  var freeze: js.UndefOr[Boolean] = js.undefined
  
  var noParse: js.UndefOr[Boolean] = js.undefined
  
  var startTime: js.UndefOr[Time] = js.undefined
  
  var topics: js.UndefOr[js.Array[String]] = js.undefined
}
object ReadOptions {
  
  inline def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    inline def setDecompress(value: Decompress): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
    
    inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
    
    inline def setEndTime(value: Time): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
    
    inline def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
    
    inline def setNoParse(value: Boolean): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
    
    inline def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
    
    inline def setStartTime(value: Time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
