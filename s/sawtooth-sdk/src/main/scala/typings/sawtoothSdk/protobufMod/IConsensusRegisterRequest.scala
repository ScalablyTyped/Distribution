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
  
  @scala.inline
  def apply(): IConsensusRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusRegisterRequest]
  }
  
  @scala.inline
  implicit class IConsensusRegisterRequestMutableBuilder[Self <: IConsensusRegisterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
