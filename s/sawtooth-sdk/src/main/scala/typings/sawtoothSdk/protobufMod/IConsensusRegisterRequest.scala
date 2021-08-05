package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusRegisterRequest extends StObject {
  
  /** ConsensusRegisterRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** ConsensusRegisterRequest version */
  var version: js.UndefOr[String | Null] = js.undefined
}
object IConsensusRegisterRequest {
  
  inline def apply(): IConsensusRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusRegisterRequest]
  }
  
  extension [Self <: IConsensusRegisterRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
