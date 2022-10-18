package typings.reactNativeWindows.mod

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeWindows.rntypesMod.TabBarIOSProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", "TabBarIOS")
@js.native
open class TabBarIOS protected ()
  extends typings.reactNativeWindows.rntypesMod.TabBarIOS {
  def this(props: TabBarIOSProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabBarIOSProps, context: Any) = this()
}
/* static members */
object TabBarIOS {
  
  @JSImport("react-native-windows", "TabBarIOS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-windows", "TabBarIOS.Item")
  @js.native
  def Item: Instantiable0[typings.reactNativeWindows.rntypesMod.TabBarIOSItem] = js.native
  inline def Item_=(x: Instantiable0[typings.reactNativeWindows.rntypesMod.TabBarIOSItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
