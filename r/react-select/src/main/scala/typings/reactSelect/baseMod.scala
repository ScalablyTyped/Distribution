package typings.reactSelect

import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("react-select/base", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactSelect.selectMod.default[OptionType]
  /* static members */
  object default {
    
    @JSImport("react-select/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/base", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    inline def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/base", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
}
