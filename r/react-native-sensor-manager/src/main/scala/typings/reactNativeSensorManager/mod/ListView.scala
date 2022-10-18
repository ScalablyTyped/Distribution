package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.ListViewDataSource
import typings.reactNative.mod.ListViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin
- Dropped new (args : ...any): react-native.react-native.TimerMixin */ @JSImport("react-native-sensor-manager", "ListView")
@js.native
open class ListView protected ()
  extends typings.reactNative.mod.ListView {
  def this(props: ListViewProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ListViewProps, context: Any) = this()
}
/* static members */
object ListView {
  
  @JSImport("react-native-sensor-manager", "ListView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-sensor-manager", "ListView.DataSource")
  @js.native
  def DataSource: ListViewDataSource = js.native
  inline def DataSource_=(x: ListViewDataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
}
