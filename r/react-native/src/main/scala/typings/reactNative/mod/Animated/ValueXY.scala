package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.AnonX
import typings.reactNative.AnonY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Animated.ValueXY")
@js.native
class ValueXY ()
  extends typings.reactNative.mod.Animated.Animated {
  def this(valueIn: AnonY) = this()
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
  def setOffset(offset: AnonX): Unit = js.native
  def setValue(value: AnonX): Unit = js.native
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* value */ AnonX, Unit]): Unit = js.native
}

