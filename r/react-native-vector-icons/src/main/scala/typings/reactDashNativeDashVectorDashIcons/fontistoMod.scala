package typings.reactDashNativeDashVectorDashIcons

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashVectorDashIcons.iconMod.Icon
import typings.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-vector-icons/Fontisto", JSImport.Namespace)
@js.native
object fontistoMod extends js.Object {
  @js.native
  class default () extends Icon
  
  /* static members */
  @js.native
  object default extends js.Object {
    @js.native
    class Button ()
      extends typings.reactDashNativeDashVectorDashIcons.iconMod.Icon.Button
    
    @js.native
    class TabBarItem ()
      extends typings.reactDashNativeDashVectorDashIcons.iconMod.Icon.TabBarItem
    
    @js.native
    class TabBarItemIOS ()
      extends typings.reactDashNativeDashVectorDashIcons.iconMod.Icon.TabBarItemIOS
    
    @js.native
    class ToolbarAndroid ()
      extends typings.reactDashNativeDashVectorDashIcons.iconMod.Icon.ToolbarAndroid
    
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    def getRawGlyphMap(): StringDictionary[Double] = js.native
    def hasIcon(name: String): Boolean = js.native
    def loadFont(): js.Promise[Unit] = js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
  }
  
}

