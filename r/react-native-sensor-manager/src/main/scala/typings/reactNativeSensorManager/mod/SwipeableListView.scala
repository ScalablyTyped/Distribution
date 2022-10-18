package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.SwipeableListViewDataSource
import typings.reactNative.mod.SwipeableListViewProps
import typings.reactNativeSensorManager.anon.ReadonlySwipeableListView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-sensor-manager", "SwipeableListView")
@js.native
open class SwipeableListView protected ()
  extends typings.reactNative.mod.SwipeableListView {
  def this(props: SwipeableListViewProps) = this()
  def this(props: ReadonlySwipeableListView) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SwipeableListViewProps, context: Any) = this()
}
/* static members */
object SwipeableListView {
  
  @JSImport("react-native-sensor-manager", "SwipeableListView")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNewDataSource(): SwipeableListViewDataSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getNewDataSource")().asInstanceOf[SwipeableListViewDataSource]
}
