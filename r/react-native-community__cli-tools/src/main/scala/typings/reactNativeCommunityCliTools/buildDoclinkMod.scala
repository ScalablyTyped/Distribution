package typings.reactNativeCommunityCliTools

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildDoclinkMod {
  
  @JSImport("@react-native-community/cli-tools/build/doclink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blog(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blog")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def blog(path: String, hashOrOverrides: Overrides & Other): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blog")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def blog(path: String, hashOrOverrides: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("blog")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def community(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("community")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def community(path: String, hashOrOverrides: Overrides & Other): String = (^.asInstanceOf[js.Dynamic].applyDynamic("community")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def community(path: String, hashOrOverrides: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("community")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def contributing(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("contributing")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def contributing(path: String, hashOrOverrides: Overrides & Other): String = (^.asInstanceOf[js.Dynamic].applyDynamic("contributing")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def contributing(path: String, hashOrOverrides: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("contributing")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def docs(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("docs")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def docs(path: String, hashOrOverrides: Overrides & Other): String = (^.asInstanceOf[js.Dynamic].applyDynamic("docs")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def docs(path: String, hashOrOverrides: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("docs")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getOS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOS")().asInstanceOf[String]
  
  inline def setPlatform(target: Platforms): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlatform")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setVersion(reactNativeVersion: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(reactNativeVersion.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def showcase(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("showcase")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def showcase(path: String, hashOrOverrides: Overrides & Other): String = (^.asInstanceOf[js.Dynamic].applyDynamic("showcase")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def showcase(path: String, hashOrOverrides: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("showcase")(path.asInstanceOf[js.Any], hashOrOverrides.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Other = StringDictionary[String]
  
  trait Overrides extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var os: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Overrides {
    
    inline def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.android
    - typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.ios
  */
  trait Platforms extends StObject
  object Platforms {
    
    inline def android: typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.android = "android".asInstanceOf[typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.android]
    
    inline def ios: typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.ios = "ios".asInstanceOf[typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.ios]
  }
}
