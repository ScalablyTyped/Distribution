package typings.reactDashNativeDashVectorDashIcons.fontAwesome5ProMod

import typings.reactDashNativeDashVectorDashIcons.Anon_0
import typings.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.ValueOf
import typings.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-vector-icons/FontAwesome5Pro", JSImport.Default)
@js.native
class default ()
  extends typings.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.default

/* static members */
@JSImport("react-native-vector-icons/FontAwesome5Pro", JSImport.Default)
@js.native
object default extends js.Object {
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String, fa5Style: ValueOf[Anon_0]): js.Promise[ImageSource] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

