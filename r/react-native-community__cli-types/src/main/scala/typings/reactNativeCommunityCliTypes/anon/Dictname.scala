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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictname extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  
  var android: PlatformConfig[
    AndroidProjectConfig, 
    AndroidProjectParams, 
    AndroidDependencyConfig, 
    AndroidDependencyParams
  ] = js.native
  
  var ios: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams] = js.native
}
object Dictname {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DictnameMutableBuilder[Self <: Dictname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(
      value: PlatformConfig[
          AndroidProjectConfig, 
          AndroidProjectParams, 
          AndroidDependencyConfig, 
          AndroidDependencyParams
        ]
    ): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(
      value: PlatformConfig[IOSProjectConfig, IOSProjectParams, IOSDependencyConfig, IOSDependencyParams]
    ): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
