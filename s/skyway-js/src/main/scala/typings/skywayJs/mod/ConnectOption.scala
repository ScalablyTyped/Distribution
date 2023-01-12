package typings.skywayJs.mod

import typings.std.RTCDataChannelInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOption
  extends StObject
     with ConnectionOption {
  
  var dcInit: js.UndefOr[RTCDataChannelInit] = js.undefined
  
  var serialization: js.UndefOr[DataConnectionSerialization] = js.undefined
}
object ConnectOption {
  
  inline def apply(): ConnectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectOption] (val x: Self) extends AnyVal {
    
    inline def setDcInit(value: RTCDataChannelInit): Self = StObject.set(x, "dcInit", value.asInstanceOf[js.Any])
    
    inline def setDcInitUndefined: Self = StObject.set(x, "dcInit", js.undefined)
    
    inline def setSerialization(value: DataConnectionSerialization): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
  }
}
