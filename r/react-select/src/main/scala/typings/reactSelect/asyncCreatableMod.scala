package typings.reactSelect

import typings.reactSelect.srcAsyncCreatableMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncCreatableMod {
  
  @JSImport("react-select/async-creatable", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected ()
    extends typings.reactSelect.srcAsyncCreatableMod.default[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/async-creatable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/async-creatable", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/async-creatable", "AsyncCreatable")
  @js.native
  class AsyncCreatable[OptionType /* <: OptionTypeBase */] protected ()
    extends typings.reactSelect.srcAsyncCreatableMod.AsyncCreatable[OptionType] {
    def this(props: Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[OptionType], context: js.Any) = this()
  }
  /* static members */
  object AsyncCreatable {
    
    @JSImport("react-select/async-creatable", "AsyncCreatable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/async-creatable", "AsyncCreatable.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
