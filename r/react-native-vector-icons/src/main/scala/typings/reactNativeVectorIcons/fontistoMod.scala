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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontistoMod {
  
  @JSImport("react-native-vector-icons/Fontisto", JSImport.Default)
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
    
    @JSImport("react-native-vector-icons/Fontisto", "default.Button")
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
    
    @JSImport("react-native-vector-icons/Fontisto", "default.TabBarItem")
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
    
    @JSImport("react-native-vector-icons/Fontisto", "default.TabBarItemIOS")
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
    
    @JSImport("react-native-vector-icons/Fontisto", "default.ToolbarAndroid")
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
    
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSource")
    @js.native
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSource")
    @js.native
    def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSource")
    @js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSource")
    @js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String): ImageSource = js.native
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: js.UndefOr[scala.Nothing], color: String): ImageSource = js.native
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: Double): ImageSource = js.native
    @JSImport("react-native-vector-icons/Fontisto", "default.getImageSourceSync")
    @js.native
    def getImageSourceSync(name: String, size: Double, color: String): ImageSource = js.native
    
    @JSImport("react-native-vector-icons/Fontisto", "default.getRawGlyphMap")
    @js.native
    def getRawGlyphMap(): StringDictionary[Double] = js.native
    
    @JSImport("react-native-vector-icons/Fontisto", "default.hasIcon")
    @js.native
    def hasIcon(name: String): Boolean = js.native
    
    @JSImport("react-native-vector-icons/Fontisto", "default.loadFont")
    @js.native
    def loadFont(): js.Promise[Unit] = js.native
    @JSImport("react-native-vector-icons/Fontisto", "default.loadFont")
    @js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
  }
}
