package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleFieldPayload extends StObject {
  
  // The arguments that were fetched.
  val args: Variables
  
  // The __id of the record containing the source/handle field.
  val dataID: DataID
  
  // The (storage) key at which the original server data was written.
  val fieldKey: String
  
  // The name of the handle.
  val handle: String
  
  // The (storage) key at which the handle's data should be written by the
  // handler.
  val handleKey: String
}
object HandleFieldPayload {
  
  inline def apply(args: Variables, dataID: DataID, fieldKey: String, handle: String, handleKey: String): HandleFieldPayload = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], dataID = dataID.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], handleKey = handleKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFieldPayload]
  }
  
  extension [Self <: HandleFieldPayload](x: Self) {
    
    inline def setArgs(value: Variables): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setDataID(value: DataID): Self = StObject.set(x, "dataID", value.asInstanceOf[js.Any])
    
    inline def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleKey(value: String): Self = StObject.set(x, "handleKey", value.asInstanceOf[js.Any])
  }
}
