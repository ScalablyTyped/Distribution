package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.srcCreatableMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creatableMod {
  
  @JSImport("react-select/creatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/creatable", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected ()
    extends typings.reactSelect.srcCreatableMod.default[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/creatable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/creatable", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/creatable", "Creatable")
  @js.native
  class Creatable[OptionType /* <: OptionTypeBase */] protected ()
    extends typings.reactSelect.srcCreatableMod.Creatable[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object Creatable {
    
    @JSImport("react-select/creatable", "Creatable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/creatable", "Creatable.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/creatable", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  inline def makeCreatableSelect(SelectComponent: ComponentType[js.Any]): typings.reactSelect.srcCreatableMod.Creatable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCreatableSelect")(SelectComponent.asInstanceOf[js.Any]).asInstanceOf[typings.reactSelect.srcCreatableMod.Creatable[js.Any]]
}
