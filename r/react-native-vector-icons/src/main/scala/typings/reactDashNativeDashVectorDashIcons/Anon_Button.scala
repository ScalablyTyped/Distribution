package typings.reactDashNativeDashVectorDashIcons

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashVectorDashIcons.iconMod.Icon
import typings.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Button extends Instantiable0[Icon] {
  var Button: Instantiable0[typings.reactDashNativeDashVectorDashIcons.iconMod.IconNs.Button] = js.native
  var TabBarItem: Instantiable0[typings.reactDashNativeDashVectorDashIcons.iconMod.IconNs.TabBarItem] = js.native
  var TabBarItemIOS: Instantiable0[typings.reactDashNativeDashVectorDashIcons.iconMod.IconNs.TabBarItemIOS] = js.native
  var ToolbarAndroid: Instantiable0[typings.reactDashNativeDashVectorDashIcons.iconMod.IconNs.ToolbarAndroid] = js.native
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

