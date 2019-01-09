package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ @JSImport("react-native", "ListView")
@js.native
class ListView () extends js.Object {
  /**
    * Exports some data, e.g. for perf investigations or analytics.
    */
  def getMetrics(): reactDashNativeLib.Anon_ContentLength = js.native
  /**
    * Provides a handle to the underlying scroll responder.
    */
  def getScrollResponder(): js.Any = js.native
  /**
    * Scrolls to a given x, y offset, either immediately or with a smooth animation.
    *
    * See `ScrollView#scrollTo`.
    */
  def scrollTo(): scala.Unit = js.native
  def scrollTo(y: reactDashNativeLib.Anon_Animated): scala.Unit = js.native
  def scrollTo(y: reactDashNativeLib.Anon_Animated, x: scala.Double): scala.Unit = js.native
  def scrollTo(y: reactDashNativeLib.Anon_Animated, x: scala.Double, animated: scala.Boolean): scala.Unit = js.native
  def scrollTo(y: scala.Double): scala.Unit = js.native
  def scrollTo(y: scala.Double, x: scala.Double): scala.Unit = js.native
  def scrollTo(y: scala.Double, x: scala.Double, animated: scala.Boolean): scala.Unit = js.native
}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ @JSImport("react-native", "ListView")
@js.native
object ListView extends js.Object {
  var DataSource: reactDashNativeLib.reactDashNativeMod.ListViewDataSource = js.native
}

