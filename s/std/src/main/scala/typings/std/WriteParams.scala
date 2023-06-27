package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteParams
  extends StObject
     with _FileSystemWriteChunkType {
  
  /* standard dom */
  var data: js.UndefOr[BufferSource | Blob | java.lang.String | Null] = js.undefined
  
  /* standard dom */
  var position: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var size: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var `type`: WriteCommandType
}
object WriteParams {
  
  inline def apply(`type`: WriteCommandType): WriteParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteParams] (val x: Self) extends AnyVal {
    
    inline def setData(value: BufferSource | Blob | java.lang.String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: WriteCommandType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
