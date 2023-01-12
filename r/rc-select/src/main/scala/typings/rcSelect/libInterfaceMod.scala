package typings.rcSelect

import typings.rcSelect.libBaseSelectMod.RawValueType
import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  trait FlattenOptionData[OptionType] extends StObject {
    
    var data: OptionType
    
    var group: js.UndefOr[Boolean] = js.undefined
    
    var groupOption: js.UndefOr[Boolean] = js.undefined
    
    var key: Key
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[RawValueType] = js.undefined
  }
  object FlattenOptionData {
    
    inline def apply[OptionType](data: OptionType, key: Key): FlattenOptionData[OptionType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenOptionData[OptionType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlattenOptionData[?], OptionType] (val x: Self & FlattenOptionData[OptionType]) extends AnyVal {
      
      inline def setData(value: OptionType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupOption(value: Boolean): Self = StObject.set(x, "groupOption", value.asInstanceOf[js.Any])
      
      inline def setGroupOptionUndefined: Self = StObject.set(x, "groupOption", js.undefined)
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
