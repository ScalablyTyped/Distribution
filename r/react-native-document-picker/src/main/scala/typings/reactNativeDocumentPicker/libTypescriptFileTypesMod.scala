package typings.reactNativeDocumentPicker

import typings.reactNativeDocumentPicker.anon.ReadonlyreadonlyallFilesp
import typings.reactNativeDocumentPicker.anon.ReadonlyreadonlyallFilesr
import typings.reactNativeDocumentPicker.anon.ReadonlyreadonlyallFilesrAllFiles
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFileTypesMod {
  
  object perPlatformTypes {
    
    @JSImport("react-native-document-picker/lib/typescript/fileTypes", "perPlatformTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-document-picker/lib/typescript/fileTypes", "perPlatformTypes.android")
    @js.native
    def android: ReadonlyreadonlyallFilesr = js.native
    inline def android_=(x: ReadonlyreadonlyallFilesr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker/lib/typescript/fileTypes", "perPlatformTypes.ios")
    @js.native
    def ios: ReadonlyreadonlyallFilesp = js.native
    inline def ios_=(x: ReadonlyreadonlyallFilesp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ios")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker/lib/typescript/fileTypes", "perPlatformTypes.macos")
    @js.native
    def macos: ReadonlyreadonlyallFilesrAllFiles = js.native
    inline def macos_=(x: ReadonlyreadonlyallFilesrAllFiles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macos")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker/lib/typescript/fileTypes", "perPlatformTypes.web")
    @js.native
    def web: ReadonlyreadonlyallFilesrAllFiles = js.native
    inline def web_=(x: ReadonlyreadonlyallFilesrAllFiles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("web")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-document-picker/lib/typescript/fileTypes", "perPlatformTypes.windows")
    @js.native
    def windows: ReadonlyreadonlyallFilesrAllFiles = js.native
    inline def windows_=(x: ReadonlyreadonlyallFilesrAllFiles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windows")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-document-picker/lib/typescript/fileTypes", "typesAreEqual")
  @js.native
  val typesAreEqual: `true` = js.native
  
  trait PlatformTypes extends StObject {
    
    var android: ReadonlyreadonlyallFilesr
    
    var ios: ReadonlyreadonlyallFilesp
    
    var windows: ReadonlyreadonlyallFilesrAllFiles
  }
  object PlatformTypes {
    
    inline def apply(
      android: ReadonlyreadonlyallFilesr,
      ios: ReadonlyreadonlyallFilesp,
      windows: ReadonlyreadonlyallFilesrAllFiles
    ): PlatformTypes = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformTypes]
    }
    
    extension [Self <: PlatformTypes](x: Self) {
      
      inline def setAndroid(value: ReadonlyreadonlyallFilesr): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setIos(value: ReadonlyreadonlyallFilesp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: ReadonlyreadonlyallFilesrAllFiles): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.ios
    - typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.android
    - typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.windows
  */
  trait SupportedPlatforms extends StObject
  object SupportedPlatforms {
    
    inline def android: typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.android = "android".asInstanceOf[typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.android]
    
    inline def ios: typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.ios = "ios".asInstanceOf[typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.ios]
    
    inline def windows: typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.windows = "windows".asInstanceOf[typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.windows]
  }
}
