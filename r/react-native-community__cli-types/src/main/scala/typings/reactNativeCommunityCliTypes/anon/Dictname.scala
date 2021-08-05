package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.androidMod.AndroidDependencyConfig
import typings.reactNativeCommunityCliTypes.androidMod.AndroidDependencyParams
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectConfig
import typings.reactNativeCommunityCliTypes.androidMod.AndroidProjectParams
import typings.reactNativeCommunityCliTypes.iosMod.IOSDependencyConfig
import typings.reactNativeCommunityCliTypes.iosMod.IOSDependencyParams
import typings.reactNativeCommunityCliTypes.iosMod.IOSProjectConfig
import typings.reactNativeCommunityCliTypes.iosMod.IOSProjectParams
import typings.reactNativeCommunityCliTypes.mod.PlatformConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictname
  extends StObject
     with /* name */ StringDictionary[PlatformConfig[js.Any, js.Any, js.Any, js.Any]] {
  
  var android: PlatformConfig[
    AndroidProjectConfig, 
    AndroidProjectParams, 
    AndroidDependencyConfig, 
    AndroidDependencyParams
  ]
  
  var ios: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams]
}
object Dictname {
  
  inline def apply(
    android: PlatformConfig[
      AndroidProjectConfig, 
      AndroidProjectParams, 
      AndroidDependencyConfig, 
      AndroidDependencyParams
    ],
    ios: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams]
  ): Dictname = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  
  extension [Self <: Dictname](x: Self) {
    
    inline def setAndroid(
      value: PlatformConfig[
          AndroidProjectConfig, 
          AndroidProjectParams, 
          AndroidDependencyConfig, 
          AndroidDependencyParams
        ]
    ): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(
      value: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams]
    ): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
