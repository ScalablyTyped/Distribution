package typings.reactNativeCommunityCliTools

import typings.reactNativeCommunityCliTools.buildDoclinkMod.Platforms
import typings.reactNativeCommunityCliTools.buildReleaseCheckerReleaseCacheManagerMod.ReleaseCacheKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeCommunityCliToolsStrings {
  
  @js.native
  sealed trait android
    extends StObject
       with Platforms
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait eTag
    extends StObject
       with ReleaseCacheKey
  inline def eTag: eTag = "eTag".asInstanceOf[eTag]
  
  @js.native
  sealed trait ios
    extends StObject
       with Platforms
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait lastChecked
    extends StObject
       with ReleaseCacheKey
  inline def lastChecked: lastChecked = "lastChecked".asInstanceOf[lastChecked]
  
  @js.native
  sealed trait latestVersion
    extends StObject
       with ReleaseCacheKey
  inline def latestVersion: latestVersion = "latestVersion".asInstanceOf[latestVersion]
  
  @js.native
  sealed trait not_running extends StObject
  inline def not_running: not_running = "not_running".asInstanceOf[not_running]
  
  @js.native
  sealed trait running extends StObject
  inline def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait unrecognized extends StObject
  inline def unrecognized: unrecognized = "unrecognized".asInstanceOf[unrecognized]
}
