package typings.reactNative

import typings.reactNative.mod.HostComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesUtilitiesCodegenNativeComponentMod {
  
  @JSImport("react-native/Libraries/Utilities/codegenNativeComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props /* <: js.Object */](componentName: String): NativeComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any]).asInstanceOf[NativeComponentType[Props]]
  inline def default[Props /* <: js.Object */](componentName: String, options: Options): NativeComponentType[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NativeComponentType[Props]]
  
  type NativeComponentType[T] = HostComponent[T]
  
  trait Options extends StObject {
    
    val excludedPlatforms: js.UndefOr[js.Array["iOS" | "android"]] = js.undefined
    
    val interfaceOnly: js.UndefOr[Boolean] = js.undefined
    
    val paperComponentName: js.UndefOr[String] = js.undefined
    
    val paperComponentNameDeprecated: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExcludedPlatforms(value: js.Array["iOS" | "android"]): Self = StObject.set(x, "excludedPlatforms", value.asInstanceOf[js.Any])
      
      inline def setExcludedPlatformsUndefined: Self = StObject.set(x, "excludedPlatforms", js.undefined)
      
      inline def setExcludedPlatformsVarargs(value: ("iOS" | "android")*): Self = StObject.set(x, "excludedPlatforms", js.Array(value*))
      
      inline def setInterfaceOnly(value: Boolean): Self = StObject.set(x, "interfaceOnly", value.asInstanceOf[js.Any])
      
      inline def setInterfaceOnlyUndefined: Self = StObject.set(x, "interfaceOnly", js.undefined)
      
      inline def setPaperComponentName(value: String): Self = StObject.set(x, "paperComponentName", value.asInstanceOf[js.Any])
      
      inline def setPaperComponentNameDeprecated(value: String): Self = StObject.set(x, "paperComponentNameDeprecated", value.asInstanceOf[js.Any])
      
      inline def setPaperComponentNameDeprecatedUndefined: Self = StObject.set(x, "paperComponentNameDeprecated", js.undefined)
      
      inline def setPaperComponentNameUndefined: Self = StObject.set(x, "paperComponentName", js.undefined)
    }
  }
}
