package typings.reactAuthKit

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsHooksMod {
  
  @JSImport("react-auth-kit/dist/utils/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * React useInterval Hook
    * Used to integrate the power of setInterval seamlessly
    *
    * @param callback - The callback function
    * @param delay - The amount of delay in minutes.
    *
    * @returns the ref of setInterval
    */
  inline def useInterval(callback: js.Function0[Unit]): MutableRefObject[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[Double | Null]]
  inline def useInterval(callback: js.Function0[Unit], delay: Double): MutableRefObject[Double | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[Double | Null]]
}
