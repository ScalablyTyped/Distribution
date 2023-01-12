package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.FieldLocation
import typings.relayRuntime.libStoreRelayStoreTypesMod.MissingRequiredFields
import typings.relayRuntime.relayRuntimeStrings.THROW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  action :'THROW',   field :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.FieldLocation}> */
trait ReadonlyactionTHROWfieldF
  extends StObject
     with MissingRequiredFields {
  
  val action: THROW
  
  val field: FieldLocation
}
object ReadonlyactionTHROWfieldF {
  
  inline def apply(field: FieldLocation): ReadonlyactionTHROWfieldF = {
    val __obj = js.Dynamic.literal(action = "THROW", field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyactionTHROWfieldF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyactionTHROWfieldF] (val x: Self) extends AnyVal {
    
    inline def setAction(value: THROW): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldLocation): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
