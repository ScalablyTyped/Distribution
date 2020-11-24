package typings.reactSelect.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupType[OptionType /* <: OptionTypeBase */]
  extends /* key */ StringDictionary[js.Any] {
  
  var options: OptionsType[OptionType] = js.native
}
object GroupType {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](options: OptionsType[OptionType]): GroupType[OptionType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupType[OptionType]]
  }
  
  @scala.inline
  implicit class GroupTypeOps[Self <: GroupType[_], OptionType /* <: OptionTypeBase */] (val x: Self with GroupType[OptionType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptionsVarargs(value: OptionType*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: OptionsType[OptionType]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
