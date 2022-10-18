package typings.reactNativeCommunityCliTools

import typings.reactNativeCommunityCliTools.buildReleaseCheckerGetLatestReleaseMod.Release
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildReleaseCheckerPrintNewReleaseMod {
  
  @JSImport("@react-native-community/cli-tools/build/releaseChecker/printNewRelease", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String, latestRelease: Release, currentVersion: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], latestRelease.asInstanceOf[js.Any], currentVersion.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
