package typings.reactNativeVectorIcons.iconMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-vector-icons/Icon", "Icon")
@js.native
class Icon ()
  extends Component[IconProps, js.Any, js.Any]
/* static members */
@JSImport("react-native-vector-icons/Icon", "Icon")
@js.native
object Icon extends js.Object {
  
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  
  def getImageSourceSync(name: String): ImageSource = js.native
  def getImageSourceSync(name: String, size: js.UndefOr[scala.Nothing], color: String): ImageSource = js.native
  def getImageSourceSync(name: String, size: Double): ImageSource = js.native
  def getImageSourceSync(name: String, size: Double, color: String): ImageSource = js.native
  
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  
  def hasIcon(name: String): Boolean = js.native
  
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
  
  @js.native
  class Button ()
    extends Component[IconButtonProps, js.Any, js.Any]
  
  @js.native
  class TabBarItem ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class TabBarItemIOS ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class ToolbarAndroid ()
    extends Component[ToolbarAndroidProps, js.Any, js.Any]
}
