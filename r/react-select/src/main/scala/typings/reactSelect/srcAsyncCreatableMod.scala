package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/AsyncCreatable", JSImport.Namespace)
@js.native
object srcAsyncCreatableMod extends js.Object {
  
  @js.native
  class AsyncCreatable[OptionType /* <: OptionTypeBase */] ()
    extends Component[Props[OptionType], State[OptionType], js.Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
    
    def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
    
    var mounted: Boolean = js.native
    
    def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta[OptionType]): Unit = js.native
    
    var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
    
    var select: Ref[_] = js.native
  }
  /* static members */
  @js.native
  object AsyncCreatable extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] () extends AsyncCreatable[OptionType]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Props[_] = js.native
  }
  
  type Props[OptionType /* <: OptionTypeBase */] = typings.reactSelect.srcAsyncMod.Props[OptionType] with typings.reactSelect.srcCreatableMod.Props[OptionType]
  
  type State[OptionType /* <: OptionTypeBase */] = typings.reactSelect.srcAsyncMod.State[OptionType] with typings.reactSelect.srcCreatableMod.State[OptionType]
}
