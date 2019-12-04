package typings.reactDashNativeDashVectorDashIcons

import typings.react.reactMod.Component
import typings.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.AllowOnlyOne
import typings.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconProps
import typings.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconVariants
import typings.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.Omit
import typings.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.ValueOf
import typings.reactDashNativeDashVectorDashIcons.iconMod.IconProps
import typings.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import typings.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`0`
import typings.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`1`
import typings.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`2`
import typings.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsNumbers.`3`
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-vector-icons/FontAwesome5", JSImport.Namespace)
@js.native
object fontAwesome5Mod extends js.Object {
  @js.native
  class default ()
    extends Component[FontAwesome5IconProps, js.Any, js.Any]
  
  @js.native
  object FA5Style extends js.Object {
    var brand: `3` = js.native
    var light: `1` = js.native
    var regular: `0` = js.native
    var solid: `2` = js.native
  }
  
  /* static members */
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
  
  type AllowOnlyOne[T, Keys /* <: String */] = (Omit[T, Keys]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Partial<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  type FontAwesome5Icon = Component[FontAwesome5IconProps, js.Any, js.Any]
  type FontAwesome5IconProps = AllowOnlyOne[
    typings.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsStrings.FontAwesome5IconProps with js.Any with IconProps, 
    FontAwesome5IconVariants
  ]
  type FontAwesome5IconVariants = String
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

