package typings.reactNativeCommunityCliPluginMetro

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetPathUtilsMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/assetPathUtils", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/assetPathUtils", "default.getAndroidAssetSuffix")
    @js.native
    def getAndroidAssetSuffix: js.Function1[/* scale */ Double, String] = js.native
    inline def getAndroidAssetSuffix_=(x: js.Function1[/* scale */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAndroidAssetSuffix")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/assetPathUtils", "default.getAndroidResourceFolderName")
    @js.native
    def getAndroidResourceFolderName: js.Function2[/* asset */ PackagerAsset, /* scale */ Double, String] = js.native
    inline def getAndroidResourceFolderName_=(x: js.Function2[/* asset */ PackagerAsset, /* scale */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAndroidResourceFolderName")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/assetPathUtils", "default.getAndroidResourceIdentifier")
    @js.native
    def getAndroidResourceIdentifier: js.Function1[/* asset */ PackagerAsset, String] = js.native
    inline def getAndroidResourceIdentifier_=(x: js.Function1[/* asset */ PackagerAsset, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAndroidResourceIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/assetPathUtils", "default.getBasePath")
    @js.native
    def getBasePath: js.Function1[/* asset */ PackagerAsset, String] = js.native
    inline def getBasePath_=(x: js.Function1[/* asset */ PackagerAsset, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBasePath")(x.asInstanceOf[js.Any])
  }
  
  trait PackagerAsset extends StObject {
    
    var httpServerLocation: String
    
    var name: String
    
    var `type`: String
  }
  object PackagerAsset {
    
    inline def apply(httpServerLocation: String, name: String, `type`: String): PackagerAsset = {
      val __obj = js.Dynamic.literal(httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackagerAsset]
    }
    
    extension [Self <: PackagerAsset](x: Self) {
      
      inline def setHttpServerLocation(value: String): Self = StObject.set(x, "httpServerLocation", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
