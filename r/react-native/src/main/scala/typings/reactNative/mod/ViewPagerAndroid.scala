package typings.reactNative.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-native", "ViewPagerAndroid")
@js.native
class ViewPagerAndroid ()
  extends Component[ViewPagerAndroidProps, js.Object, js.Any] {
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

