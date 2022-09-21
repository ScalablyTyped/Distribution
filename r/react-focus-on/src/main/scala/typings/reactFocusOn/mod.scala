package typings.reactFocusOn

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactFocusOn.typesMod.ReactFocusOnProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-focus-on", "FocusOn")
  @js.native
  val FocusOn: ForwardRefExoticComponent[ReactFocusOnProps & RefAttributes[HTMLElement]] = js.native
  
  object classNames {
    
    @JSImport("react-focus-on", "classNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-focus-on", "classNames.fullWidth")
    @js.native
    def fullWidth: String = js.native
    inline def fullWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-focus-on", "classNames.zeroRight")
    @js.native
    def zeroRight: String = js.native
    inline def zeroRight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zeroRight")(x.asInstanceOf[js.Any])
  }
}
