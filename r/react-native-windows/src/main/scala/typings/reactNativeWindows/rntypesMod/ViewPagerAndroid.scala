package typings.reactNativeWindows.rntypesMod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.NativeMethods */ @JSImport("react-native-windows/rntypes", "ViewPagerAndroid")
@js.native
open class ViewPagerAndroid ()
  extends Component[ViewPagerAndroidProps, js.Object, Any] {
  
  /**
    * A helper function to scroll to a specific page in the ViewPager.
    * The transition between pages will be animated.
    */
  def setPage(selectedPage: Double): Unit = js.native
  
  /**
    * A helper function to scroll to a specific page in the ViewPager.
    * The transition between pages will *not* be animated.
    */
  def setPageWithoutAnimation(selectedPage: Double): Unit = js.native
}
