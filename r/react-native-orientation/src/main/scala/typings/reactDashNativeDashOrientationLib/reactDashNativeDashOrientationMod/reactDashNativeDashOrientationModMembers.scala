package typings
package reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-orientation", JSImport.Namespace)
@js.native
object reactDashNativeDashOrientationModMembers extends js.Object {
  def addOrientationListener(
    callback: js.Function1[
      /* orientation */ reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addSpecificOrientationListener(
    callback: js.Function1[
      /* specificOrientation */ reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getInitialOrientation(): reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation = js.native
  def getOrientation(
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* orientation */ reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getSpecificOrientation(
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* orientation */ reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lockToLandscape(): scala.Unit = js.native
  def lockToLandscapeLeft(): scala.Unit = js.native
  def lockToLandscapeRight(): scala.Unit = js.native
  def lockToPortrait(): scala.Unit = js.native
  def removeOrientationListener(
    callback: js.Function1[
      /* orientation */ reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def removeSpecificOrientationListener(
    callback: js.Function1[
      /* specificOrientation */ reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def unlockAllOrientations(): scala.Unit = js.native
}

