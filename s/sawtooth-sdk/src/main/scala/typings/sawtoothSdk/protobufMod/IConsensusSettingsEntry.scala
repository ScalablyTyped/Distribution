package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusSettingsEntry extends StObject {
  
  /** ConsensusSettingsEntry key */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /** ConsensusSettingsEntry value */
  var value: js.UndefOr[String | Null] = js.undefined
}
object IConsensusSettingsEntry {
  
  @scala.inline
  def apply(): IConsensusSettingsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSettingsEntry]
  }
  
  @scala.inline
  implicit class IConsensusSettingsEntryMutableBuilder[Self <: IConsensusSettingsEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
