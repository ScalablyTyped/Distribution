package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusSettingsGetRequest extends StObject {
  
  /** ConsensusSettingsGetRequest blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** ConsensusSettingsGetRequest keys */
  var keys: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IConsensusSettingsGetRequest {
  
  @scala.inline
  def apply(): IConsensusSettingsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSettingsGetRequest]
  }
  
  @scala.inline
  implicit class IConsensusSettingsGetRequestMutableBuilder[Self <: IConsensusSettingsGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysNull: Self = StObject.set(x, "keys", null)
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
