package typings.rcSelect

import typings.rcSelect.generateMod.RefSelectProps
import typings.rcSelect.generateMod.SelectProps
import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.interfaceMod.OptionsType
import typings.rcSelect.optGroupMod.OptionGroupFC
import typings.rcSelect.optionMod.OptionFC
import typings.react.mod.Component
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @JSImport("rc-select/lib/Select", JSImport.Default)
  @js.native
  class default[VT] () extends Select[VT]
  object default {
    
    @JSImport("rc-select/lib/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof OptGroup` */
    @JSImport("rc-select/lib/Select", "default.OptGroup")
    @js.native
    def OptGroup: OptionGroupFC = js.native
    @scala.inline
    def OptGroup_=(x: OptionGroupFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptGroup")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof Option` */
    @JSImport("rc-select/lib/Select", "default.Option")
    @js.native
    def Option: OptionFC = js.native
    @scala.inline
    def Option_=(x: OptionFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  type ExportedSelectProps[ValueType /* <: DefaultValueType */] = SelectProps[OptionsType, ValueType]
  
  /**
    * Typescript not support generic with function component,
    * we have to wrap an class component to handle this.
    */
  @js.native
  trait Select[VT]
    extends Component[SelectProps[OptionsType, VT], js.Object, js.Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var selectRef: RefObject[RefSelectProps] = js.native
  }
}
