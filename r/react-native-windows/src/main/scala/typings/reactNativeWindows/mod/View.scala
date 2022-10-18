package typings.reactNativeWindows.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", "View")
@js.native
open class View ()
  extends typings.reactNativeWindows.rntypesMod.View
/* static members */
object View {
  
  @JSImport("react-native-windows", "View")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
    * @platform ios
    */
  @JSImport("react-native-windows", "View.forceTouchAvailable")
  @js.native
  def forceTouchAvailable: Boolean = js.native
  inline def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
}
