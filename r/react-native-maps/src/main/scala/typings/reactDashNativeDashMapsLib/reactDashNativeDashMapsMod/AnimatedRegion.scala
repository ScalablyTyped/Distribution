package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-maps", "AnimatedRegion")
@js.native
class AnimatedRegion ()
  extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedWithChildren {
  def this(region: Region) = this()
  var latitude: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value = js.native
  var latitudeDelta: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value = js.native
  var longitude: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value = js.native
  var longitudeDelta: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value = js.native
  def addListener(callback: js.Function1[/* region */ Region, scala.Unit]): java.lang.String = js.native
  def flattenOffset(): scala.Unit = js.native
  def removeListener(id: java.lang.String): scala.Unit = js.native
  def setOffset(offset: Region): scala.Unit = js.native
  def setValue(value: Region): scala.Unit = js.native
  def spring(config: AnimatedRegionSpringConfig): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def stopAnimation(): scala.Unit = js.native
  def stopAnimation(callback: js.Function1[/* region */ Region, scala.Unit]): scala.Unit = js.native
  def timing(config: AnimatedRegionTimingConfig): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
}

