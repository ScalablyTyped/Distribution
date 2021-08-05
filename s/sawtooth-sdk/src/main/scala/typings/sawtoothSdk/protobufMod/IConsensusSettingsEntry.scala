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
  
  inline def apply(): IConsensusSettingsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSettingsEntry]
  }
  
  extension [Self <: IConsensusSettingsEntry](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
