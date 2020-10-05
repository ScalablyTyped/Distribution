package typings.rcSelect

import typings.rcSelect.generateMod.RefSelectProps
import typings.rcSelect.generateMod.SelectProps
import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.interfaceMod.OptionsType
import typings.rcSelect.optGroupMod.OptionGroupFC
import typings.rcSelect.optionMod.OptionFC
import typings.react.mod.Component
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-select/lib/Select", JSImport.Namespace)
@js.native
object selectMod extends js.Object {
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @js.native
  trait Select[VT]
    extends Component[SelectProps[OptionsType, VT], js.Object, js.Any] {
    var selectRef: RefObject[RefSelectProps] = js.native
    def blur(): Unit = js.native
    def focus(): Unit = js.native
  }
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @js.native
  class default[VT] () extends Select[VT]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var OptGroup: OptionGroupFC = js.native
    var Option: OptionFC = js.native
  }
  
  type ExportedSelectProps[ValueType /* <: DefaultValueType */] = SelectProps[OptionsType, ValueType]
}

