package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.ColorValue
import typings.reactNativeVectorIcons.iconMod.Icon
import typings.reactNativeVectorIcons.iconMod.IconButtonProps
import typings.reactNativeVectorIcons.iconMod.IconProps
import typings.reactNativeVectorIcons.iconMod.ImageSource
import typings.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entypoMod {
  
  @JSImport("react-native-vector-icons/Entypo", JSImport.Default)
  @js.native
  open class default protected () extends Icon {
    def this(props: IconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-vector-icons/Entypo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-vector-icons/Entypo", "default.Button")
    @js.native
    open class Button protected ()
      extends typings.reactNativeVectorIcons.iconMod.Icon.Button {
      def this(props: IconButtonProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: IconButtonProps, context: Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Entypo", "default.TabBarItem")
    @js.native
    open class TabBarItem protected ()
      extends typings.reactNativeVectorIcons.iconMod.Icon.TabBarItem {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Entypo", "default.TabBarItemIOS")
    @js.native
    open class TabBarItemIOS protected ()
      extends typings.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: Any) = this()
    }
    
    inline def getFontFamily(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontFamily")().asInstanceOf[String]
    
    inline def getImageSource(name: String): js.Promise[ImageSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: ColorValue): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: ColorValue): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    
    inline def getImageSourceSync(name: String): ImageSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any]).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: ColorValue): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: ColorValue): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    
    inline def getRawGlyphMap(): StringDictionary[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawGlyphMap")().asInstanceOf[StringDictionary[Double]]
    
    inline def hasIcon(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIcon")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def loadFont(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")().asInstanceOf[js.Promise[Unit]]
    inline def loadFont(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
}
