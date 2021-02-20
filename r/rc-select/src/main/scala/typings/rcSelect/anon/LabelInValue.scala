package typings.rcSelect.anon

import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.RawValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelInValue[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] extends StObject {
  
  var labelInValue: Boolean = js.native
  
  var optionLabelProp: String = js.native
  
  var options: FOT = js.native
  
  var prevValue: DefaultValueType = js.native
}
object LabelInValue {
  
  @scala.inline
  def apply[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */](labelInValue: Boolean, optionLabelProp: String, options: FOT, prevValue: DefaultValueType): LabelInValue[FOT] = {
    val __obj = js.Dynamic.literal(labelInValue = labelInValue.asInstanceOf[js.Any], optionLabelProp = optionLabelProp.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelInValue[FOT]]
  }
  
  @scala.inline
  implicit class LabelInValueMutableBuilder[Self <: LabelInValue[_], FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] (val x: Self with LabelInValue[FOT]) extends AnyVal {
    
    @scala.inline
    def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionLabelProp(value: String): Self = StObject.set(x, "optionLabelProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FOT): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValue(value: DefaultValueType): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValueVarargs(value: (LabelValueType | RawValueType)*): Self = StObject.set(x, "prevValue", js.Array(value :_*))
  }
}
