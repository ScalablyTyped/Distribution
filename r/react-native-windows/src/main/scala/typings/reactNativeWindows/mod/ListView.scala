package typings.reactNativeWindows.mod

import typings.reactNativeWindows.rntypesMod.ListViewDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", "ListView")
@js.native
open class ListView ()
  extends typings.reactNativeWindows.rntypesMod.ListView
/* static members */
object ListView {
  
  @JSImport("react-native-windows", "ListView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-windows", "ListView.DataSource")
  @js.native
  def DataSource: ListViewDataSource = js.native
  inline def DataSource_=(x: ListViewDataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
}
