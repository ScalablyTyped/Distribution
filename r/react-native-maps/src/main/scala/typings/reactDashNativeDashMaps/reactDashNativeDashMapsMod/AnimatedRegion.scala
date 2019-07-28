package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedWithChildren
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.CompositeAnimation
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-maps", "AnimatedRegion")
@js.native
class AnimatedRegion () extends AnimatedWithChildren {
  def this(region: Region) = this()
  var latitude: Value = js.native
  var latitudeDelta: Value = js.native
  var longitude: Value = js.native
  var longitudeDelta: Value = js.native
  def addListener(callback: js.Function1[/* region */ Region, Unit]): String = js.native
  def flattenOffset(): Unit = js.native
  def removeListener(id: String): Unit = js.native
  def setOffset(offset: Region): Unit = js.native
  def setValue(value: Region): Unit = js.native
  def spring(config: AnimatedRegionSpringConfig): CompositeAnimation = js.native
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* region */ Region, Unit]): Unit = js.native
  def timing(config: AnimatedRegionTimingConfig): CompositeAnimation = js.native
}

