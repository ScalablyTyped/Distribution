package typings.reactSelect

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactSelect.srcAsyncMod.AsyncComponentProps
import typings.reactSelect.srcAsyncMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("react-select/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/async", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected ()
    extends typings.reactSelect.srcAsyncMod.default[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/async", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/async", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/async", "Async")
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] protected ()
    extends typings.reactSelect.srcAsyncMod.Async[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object Async {
    
    @JSImport("react-select/async", "Async")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/async", "Async.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/async", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  inline def makeAsyncSelect[T /* <: ComponentType[js.Any] */](SelectComponent: T): ComponentClass[AsyncComponentProps[T], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAsyncSelect")(SelectComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[AsyncComponentProps[T], ComponentState]]
}
