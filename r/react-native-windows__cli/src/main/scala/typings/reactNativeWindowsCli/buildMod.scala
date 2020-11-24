package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.Config
import typings.reactNativeWindowsCli.msbuildtoolsMod.default
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildArch
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import typings.reactNativeWindowsCli.runWindowsOptionsMod.RunWindowsOptions_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/build", JSImport.Namespace)
@js.native
object buildMod extends js.Object {
  
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean
  ): js.Promise[Unit] = js.native
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean,
    target: js.UndefOr[scala.Nothing],
    buildLogDirectory: String
  ): js.Promise[Unit] = js.native
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean,
    target: String
  ): js.Promise[Unit] = js.native
  def buildSolution(
    buildTools: default,
    slnFile: String,
    buildType: BuildConfig,
    buildArch: BuildArch,
    msBuildProps: Record[String, String],
    verbose: Boolean,
    target: String,
    buildLogDirectory: String
  ): js.Promise[Unit] = js.native
  
  def getAppProjectFile(options: RunWindowsOptions_, config: Config): String | Null = js.native
  
  def getAppSolutionFile(options: RunWindowsOptions_, config: Config): String | Null = js.native
  
  def parseMsBuildProps(options: RunWindowsOptions_): Record[String, String] = js.native
  
  def restoreNuGetPackages(slnFile: String, buildTools: default, verbose: Boolean): js.Promise[Unit] = js.native
}
