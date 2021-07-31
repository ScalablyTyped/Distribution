package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildArch
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msbuildtoolsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/msbuildtools", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with MSBuildTools {
    /**
      * @param version is something like 16.0 for 2019
      * @param msbuildPath  Path to MSBuild.exe (x86)
      * @param installationVersion is the full version e.g. 16.3.29411.108
      */
    def this(version: String, msbuildPath: String, installationVersion: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/msbuildtools", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def findAvailableVersion(buildArch: BuildArch, verbose: Boolean): MSBuildTools = (^.asInstanceOf[js.Dynamic].applyDynamic("findAvailableVersion")(buildArch.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[MSBuildTools]
    
    @scala.inline
    def getAllAvailableUAPVersions(): js.Array[typings.reactNativeWindowsCli.versionMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAvailableUAPVersions")().asInstanceOf[js.Array[typings.reactNativeWindowsCli.versionMod.default]]
  }
  
  @js.native
  trait MSBuildTools extends StObject {
    
    def buildProject(
      slnFile: String,
      buildType: BuildConfig,
      buildArch: BuildArch,
      msBuildProps: Record[String, String],
      verbose: Boolean
    ): js.Promise[Unit] = js.native
    def buildProject(
      slnFile: String,
      buildType: BuildConfig,
      buildArch: BuildArch,
      msBuildProps: Record[String, String],
      verbose: Boolean,
      target: String
    ): js.Promise[Unit] = js.native
    def buildProject(
      slnFile: String,
      buildType: BuildConfig,
      buildArch: BuildArch,
      msBuildProps: Record[String, String],
      verbose: Boolean,
      target: String,
      buildLogDirectory: String
    ): js.Promise[Unit] = js.native
    def buildProject(
      slnFile: String,
      buildType: BuildConfig,
      buildArch: BuildArch,
      msBuildProps: Record[String, String],
      verbose: Boolean,
      target: Unit,
      buildLogDirectory: String
    ): js.Promise[Unit] = js.native
    
    def cleanProject(slnFile: String): Unit = js.native
    
    val installationVersion: String = js.native
    
    val msbuildPath: String = js.native
    
    val version: String = js.native
  }
}
