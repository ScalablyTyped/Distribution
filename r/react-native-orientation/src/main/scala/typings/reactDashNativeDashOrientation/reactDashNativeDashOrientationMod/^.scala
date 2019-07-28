package typings.reactDashNativeDashOrientation.reactDashNativeDashOrientationMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-orientation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addOrientationListener(callback: js.Function1[/* orientation */ orientation, Unit]): Unit = js.native
  def addSpecificOrientationListener(callback: js.Function1[/* specificOrientation */ specificOrientation, Unit]): Unit = js.native
  def getInitialOrientation(): orientation = js.native
  def getOrientation(callback: js.Function2[/* err */ Error, /* orientation */ orientation, Unit]): Unit = js.native
  def getSpecificOrientation(callback: js.Function2[/* err */ Error, /* orientation */ specificOrientation, Unit]): Unit = js.native
  def lockToLandscape(): Unit = js.native
  def lockToLandscapeLeft(): Unit = js.native
  def lockToLandscapeRight(): Unit = js.native
  def lockToPortrait(): Unit = js.native
  def removeOrientationListener(callback: js.Function1[/* orientation */ orientation, Unit]): Unit = js.native
  def removeSpecificOrientationListener(callback: js.Function1[/* specificOrientation */ specificOrientation, Unit]): Unit = js.native
  def unlockAllOrientations(): Unit = js.native
}

