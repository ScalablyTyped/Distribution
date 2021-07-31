package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.Config
import typings.reactNativeWindowsCli.msbuildtoolsMod.default
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildArch
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import typings.reactNativeWindowsCli.runWindowsOptionsMod.RunWindowsOptions_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSolution")(buildTools.asInstanceOf[js.Any], slnFile.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any], buildArch.asInstanceOf[js.Any], msBuildProps.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean,
    target: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSolution")(buildTools.asInstanceOf[js.Any], slnFile.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any], buildArch.asInstanceOf[js.Any], msBuildProps.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean,
    target: String,
    buildLogDirectory: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSolution")(buildTools.asInstanceOf[js.Any], slnFile.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any], buildArch.asInstanceOf[js.Any], msBuildProps.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], target.asInstanceOf[js.Any], buildLogDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean,
    target: Unit,
    buildLogDirectory: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSolution")(buildTools.asInstanceOf[js.Any], slnFile.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any], buildArch.asInstanceOf[js.Any], msBuildProps.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], target.asInstanceOf[js.Any], buildLogDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getAppProjectFile(options: RunWindowsOptions_, config: Config): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppProjectFile")(options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def getAppSolutionFile(options: RunWindowsOptions_, config: Config): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppSolutionFile")(options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def parseMsBuildProps(options: RunWindowsOptions_): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMsBuildProps")(options.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  @scala.inline
  def restoreNuGetPackages(slnFile: String, buildTools: default, verbose: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreNuGetPackages")(slnFile.asInstanceOf[js.Any], buildTools.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
