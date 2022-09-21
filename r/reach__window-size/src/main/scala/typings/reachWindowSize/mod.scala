package typings.reachWindowSize

import typings.reachWindowSize.anon.Height
import typings.reachWindowSize.srcMod.WindowSizeProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/window-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * WindowSize
    *
    * @see Docs https://reach.tech/window-size#windowsize
    * @param props
    */
  @JSImport("@reach/window-size", JSImport.Default)
  @js.native
  val default: FC[WindowSizeProps] = js.native
  
  /**
    * WindowSize
    *
    * @see Docs https://reach.tech/window-size#windowsize
    * @param props
    */
  @JSImport("@reach/window-size", "WindowSize")
  @js.native
  val WindowSize: FC[WindowSizeProps] = js.native
  
  /**
    * useWindowSize
    *
    * @see Docs https://reach.tech/window-size#usewindowsize
    */
  inline def useWindowSize(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowSize")().asInstanceOf[Height]
}
