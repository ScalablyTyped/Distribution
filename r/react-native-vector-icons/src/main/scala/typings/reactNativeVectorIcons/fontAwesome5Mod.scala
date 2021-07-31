package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.reactNativeVectorIcons.anon.Brand
import typings.reactNativeVectorIcons.anon.KinFontAwesome5IconVarian
import typings.reactNativeVectorIcons.iconMod.Icon.Button
import typings.reactNativeVectorIcons.iconMod.Icon.TabBarItem
import typings.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS
import typings.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid
import typings.reactNativeVectorIcons.iconMod.ImageSource
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`0`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`1`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`2`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`3`
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontAwesome5Mod {
  
  @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
  @js.native
  class default ()
    extends Component[FontAwesome5IconProps, js.Any, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-vector-icons/FontAwesome5", "default.Button")
    @js.native
    def Button: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.Button] = js.native
    @scala.inline
    def Button_=(x: Instantiable0[Button]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "default.TabBarItem")
    @js.native
    def TabBarItem: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItem] = js.native
    
    @JSImport("react-native-vector-icons/FontAwesome5", "default.TabBarItemIOS")
    @js.native
    def TabBarItemIOS: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS] = js.native
    @scala.inline
    def TabBarItemIOS_=(x: Instantiable0[TabBarItemIOS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabBarItemIOS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TabBarItem_=(x: Instantiable0[TabBarItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabBarItem")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "default.ToolbarAndroid")
    @js.native
    def ToolbarAndroid: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid] = js.native
    @scala.inline
    def ToolbarAndroid_=(x: Instantiable0[ToolbarAndroid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToolbarAndroid")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getImageSource(name: String): js.Promise[ImageSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageSource]]
    @scala.inline
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    @scala.inline
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    @scala.inline
    def getImageSource(name: String, size: Double, color: String, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    @scala.inline
    def getImageSource(name: String, size: Double, color: Unit, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    @scala.inline
    def getImageSource(name: String, size: Unit, color: String): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    @scala.inline
    def getImageSource(name: String, size: Unit, color: String, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    @scala.inline
    def getImageSource(name: String, size: Unit, color: Unit, fa5Style: ValueOf[Brand]): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    
    @scala.inline
    def getImageSourceSync(name: String): ImageSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any]).asInstanceOf[ImageSource]
    @scala.inline
    def getImageSourceSync(name: String, size: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    @scala.inline
    def getImageSourceSync(name: String, size: Double, color: String): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    @scala.inline
    def getImageSourceSync(name: String, size: Double, color: String, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    @scala.inline
    def getImageSourceSync(name: String, size: Double, color: Unit, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    @scala.inline
    def getImageSourceSync(name: String, size: Unit, color: String): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    @scala.inline
    def getImageSourceSync(name: String, size: Unit, color: String, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    @scala.inline
    def getImageSourceSync(name: String, size: Unit, color: Unit, fa5Style: ValueOf[Brand]): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any], fa5Style.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    
    @scala.inline
    def hasIcon(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIcon")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def loadFont(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")().asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def loadFont(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  object FA5Style {
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.brand")
    @js.native
    def brand: `3` = js.native
    @scala.inline
    def brand_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brand")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.light")
    @js.native
    def light: `1` = js.native
    @scala.inline
    def light_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.regular")
    @js.native
    def regular: `0` = js.native
    @scala.inline
    def regular_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regular")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-vector-icons/FontAwesome5", "FA5Style.solid")
    @js.native
    def solid: `2` = js.native
    @scala.inline
    def solid_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("solid")(x.asInstanceOf[js.Any])
  }
  
  type AllowOnlyOne[T, Keys /* <: /* keyof T */ String */] = (Omit[T, Keys]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Partial<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  
  type FontAwesome5Icon = Component[FontAwesome5IconProps, js.Any, js.Any]
  
  type FontAwesome5IconProps = AllowOnlyOne[KinFontAwesome5IconVarian, FontAwesome5IconVariants]
  
  /* Inlined keyof react-native-vector-icons.react-native-vector-icons/FontAwesome5.Omit<{  regular :0,   light :1,   solid :2,   brand :3}, 'regular'> */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.light
    - typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.solid
    - typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.brand
  */
  trait FontAwesome5IconVariants extends StObject
  object FontAwesome5IconVariants {
    
    @scala.inline
    def brand: typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.brand = "brand".asInstanceOf[typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.brand]
    
    @scala.inline
    def light: typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.light = "light".asInstanceOf[typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.light]
    
    @scala.inline
    def solid: typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.solid = "solid".asInstanceOf[typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.solid]
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
