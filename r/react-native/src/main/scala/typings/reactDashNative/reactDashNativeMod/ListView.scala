package typings.reactDashNative.reactDashNativeMod

import typings.react.reactMod.Component
import typings.reactDashNative.Anon_Animated
import typings.reactDashNative.Anon_ContentLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin
- Dropped new (args : ...any): react-native.react-native.TimerMixin */ @JSImport("react-native", "ListView")
@js.native
class ListView ()
  extends Component[ListViewProps, js.Object, js.Any] {
  /**
    * Exports some data, e.g. for perf investigations or analytics.
    */
  def getMetrics(): Anon_ContentLength = js.native
  /**
    * Provides a handle to the underlying scroll responder.
    */
  def getScrollResponder(): js.Any = js.native
  /**
    * Scrolls to a given x, y offset, either immediately or with a smooth animation.
    *
    * See `ScrollView#scrollTo`.
    */
  def scrollTo(): Unit = js.native
  def scrollTo(y: Double): Unit = js.native
  def scrollTo(y: Double, x: Double): Unit = js.native
  def scrollTo(y: Double, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Anon_Animated): Unit = js.native
  def scrollTo(y: Anon_Animated, x: Double): Unit = js.native
  def scrollTo(y: Anon_Animated, x: Double, animated: Boolean): Unit = js.native
}

/* static members */
@JSImport("react-native", "ListView")
@js.native
object ListView extends js.Object {
  var DataSource: ListViewDataSource = js.native
}

