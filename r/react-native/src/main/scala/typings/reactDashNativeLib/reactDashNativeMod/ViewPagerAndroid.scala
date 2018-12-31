package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped new Some()Some((args  : ...any))Some(: react-native.react-native.NativeMethodsMixin) */ @JSImport("react-native", "ViewPagerAndroid")
@js.native
class ViewPagerAndroid () extends js.Object {
  /**
    * A helper function to scroll to a specific page in the ViewPager.
    * The transition between pages will be animated.
    */
  def setPage(selectedPage: scala.Double): scala.Unit = js.native
  /**
    * A helper function to scroll to a specific page in the ViewPager.
    * The transition between pages will *not* be animated.
    */
  def setPageWithoutAnimation(selectedPage: scala.Double): scala.Unit = js.native
}

