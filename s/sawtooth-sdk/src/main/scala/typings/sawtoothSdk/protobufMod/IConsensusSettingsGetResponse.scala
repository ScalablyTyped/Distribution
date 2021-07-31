package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusSettingsGetResponse extends StObject {
  
  /** ConsensusSettingsGetResponse entries */
  var entries: js.UndefOr[js.Array[IConsensusSettingsEntry] | Null] = js.undefined
  
  /** ConsensusSettingsGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusSettingsGetResponse {
  
  @scala.inline
  def apply(): IConsensusSettingsGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSettingsGetResponse]
  }
  
  @scala.inline
  implicit class IConsensusSettingsGetResponseMutableBuilder[Self <: IConsensusSettingsGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[IConsensusSettingsEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: IConsensusSettingsEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
