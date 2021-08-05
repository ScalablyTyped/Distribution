package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusStateEntry extends StObject {
  
  /** ConsensusStateEntry address */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /** ConsensusStateEntry data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IConsensusStateEntry {
  
  inline def apply(): IConsensusStateEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusStateEntry]
  }
  
  extension [Self <: IConsensusStateEntry](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
