package typings.reactDashNative.reactDashNativeMod.Animated

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.Anon_X
import typings.reactDashNative.Anon_XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Animated.ValueXY")
@js.native
class ValueXY ()
  extends typings.reactDashNative.reactDashNativeMod.Animated.Animated {
  def this(valueIn: Anon_XY) = this()
  var x: AnimatedValue = js.native
  var y: AnimatedValue = js.native
  def addListener(callback: ValueXYListenerCallback): String = js.native
  def extractOffset(): Unit = js.native
  def flattenOffset(): Unit = js.native
  /**
    * Converts `{x, y}` into `{left, top}` for use in style, e.g.
    *
    *```javascript
    *  style={this.state.anim.getLayout()}
    *```
    */
  def getLayout(): StringDictionary[AnimatedValue] = js.native
  /**
    * Converts `{x, y}` into a useable translation transform, e.g.
    *
    *```javascript
    *  style={{
    *    transform: this.state.anim.getTranslateTransform()
    *  }}
    *```
    */
  def getTranslateTransform(): js.Array[StringDictionary[AnimatedValue]] = js.native
  def removeListener(id: String): Unit = js.native
  def setOffset(offset: Anon_X): Unit = js.native
  def setValue(value: Anon_X): Unit = js.native
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* value */ Anon_X, Unit]): Unit = js.native
}

