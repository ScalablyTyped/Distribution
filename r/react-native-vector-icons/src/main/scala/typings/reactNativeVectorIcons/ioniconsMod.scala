package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeVectorIcons.iconMod.Icon
import typings.reactNativeVectorIcons.iconMod.IconButtonProps
import typings.reactNativeVectorIcons.iconMod.IconProps
import typings.reactNativeVectorIcons.iconMod.ImageSource
import typings.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typings.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioniconsMod {
  
  @JSImport("react-native-vector-icons/Ionicons", JSImport.Default)
  @js.native
  class default protected () extends Icon {
    def this(props: IconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-vector-icons/Ionicons", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-vector-icons/Ionicons", "default.Button")
    @js.native
    class Button protected ()
      extends typings.reactNativeVectorIcons.iconMod.Icon.Button {
      def this(props: IconButtonProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: IconButtonProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Ionicons", "default.TabBarItem")
    @js.native
    class TabBarItem protected ()
      extends typings.reactNativeVectorIcons.iconMod.Icon.TabBarItem {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Ionicons", "default.TabBarItemIOS")
    @js.native
    class TabBarItemIOS protected ()
      extends typings.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS {
      def this(props: TabBarItemIOSProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabBarItemIOSProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-vector-icons/Ionicons", "default.ToolbarAndroid")
    @js.native
    class ToolbarAndroid protected ()
      extends typings.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid {
      def this(props: ToolbarAndroidProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ToolbarAndroidProps, context: js.Any) = this()
    }
    
    inline def getImageSource(name: String): js.Promise[ImageSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    inline def getImageSource(name: String, size: Unit, color: String): js.Promise[ImageSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSource")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageSource]]
    
    inline def getImageSourceSync(name: String): ImageSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any]).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Double, color: String): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    inline def getImageSourceSync(name: String, size: Unit, color: String): ImageSource = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageSourceSync")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ImageSource]
    
    inline def getRawGlyphMap(): StringDictionary[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawGlyphMap")().asInstanceOf[StringDictionary[Double]]
    
    inline def hasIcon(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIcon")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def loadFont(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")().asInstanceOf[js.Promise[Unit]]
    inline def loadFont(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
}
