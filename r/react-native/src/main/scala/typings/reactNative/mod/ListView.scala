package typings.reactNative.mod

import typings.react.mod.Component
import typings.reactNative.anon.ContentLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin
- Dropped new (args : ...any): react-native.react-native.TimerMixin */ @JSImport("react-native", "ListView")
@js.native
class ListView ()
  extends Component[ListViewProps, js.Object, js.Any] {
  
  /**
    * Exports some data, e.g. for perf investigations or analytics.
    */
  def getMetrics(): ContentLength = js.native
  
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
  def scrollTo(y: Double, x: Unit, animated: Boolean): Unit = js.native
  def scrollTo(y: Unit, x: Double): Unit = js.native
  def scrollTo(y: Unit, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Unit, x: Unit, animated: Boolean): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated, x: Double): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: typings.reactNative.anon.Animated, x: Unit, animated: Boolean): Unit = js.native
}
/* static members */
object ListView {
  
  @JSImport("react-native", "ListView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "ListView.DataSource")
  @js.native
  def DataSource: ListViewDataSource = js.native
  @scala.inline
  def DataSource_=(x: ListViewDataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
}
