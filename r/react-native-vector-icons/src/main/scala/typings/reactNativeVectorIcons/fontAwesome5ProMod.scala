package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeVectorIcons.anon.Brand
import typings.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps
import typings.reactNativeVectorIcons.fontAwesome5Mod.ValueOf
import typings.reactNativeVectorIcons.iconMod.ImageSource
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`0`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`1`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`2`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-vector-icons/FontAwesome5Pro", JSImport.Namespace)
@js.native
object fontAwesome5ProMod extends js.Object {
  
  @js.native
  object FA5Style extends js.Object {
    
    var brand: `3` = js.native
    
    var light: `1` = js.native
    
    var regular: `0` = js.native
    
    var solid: `2` = js.native
  }
  
  @js.native
  class default ()
    extends typings.reactNativeVectorIcons.fontAwesome5Mod.default
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Button: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.Button] = js.native
    
    var TabBarItem: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItem] = js.native
    
    var TabBarItemIOS: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS] = js.native
    
    var ToolbarAndroid: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid] = js.native
    
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    def getImageSource(
      name: String,
      size: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      fa5Style: ValueOf[Brand]
    ): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: js.UndefOr[scala.Nothing], fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: String, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = js.native
    
    def getImageSourceSync(name: String): ImageSource = js.native
    def getImageSourceSync(
      name: String,
      size: js.UndefOr[scala.Nothing],
      color: js.UndefOr[scala.Nothing],
      fa5Style: ValueOf[Brand]
    ): ImageSource = js.native
    def getImageSourceSync(name: String, size: js.UndefOr[scala.Nothing], color: String): ImageSource = js.native
    def getImageSourceSync(name: String, size: js.UndefOr[scala.Nothing], color: String, fa5Style: ValueOf[Brand]): ImageSource = js.native
    def getImageSourceSync(name: String, size: Double): ImageSource = js.native
    def getImageSourceSync(name: String, size: Double, color: js.UndefOr[scala.Nothing], fa5Style: ValueOf[Brand]): ImageSource = js.native
    def getImageSourceSync(name: String, size: Double, color: String): ImageSource = js.native
    def getImageSourceSync(name: String, size: Double, color: String, fa5Style: ValueOf[Brand]): ImageSource = js.native
    
    def hasIcon(name: String): Boolean = js.native
    
    def loadFont(): js.Promise[Unit] = js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
  }
  
  type FontAwesome5ProIconProps = FontAwesome5IconProps
}
