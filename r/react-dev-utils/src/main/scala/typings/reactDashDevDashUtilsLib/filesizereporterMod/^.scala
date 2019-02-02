package typings
package reactDashDevDashUtilsLib.filesizereporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/FileSizeReporter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def measureFileSizesBeforeBuild(buildFolder: java.lang.String): js.Promise[reactDashDevDashUtilsLib.filesizereporterMod.OpaqueFileSizes] = js.native
  def printFileSizesAfterBuild(
    webpackStats: webpackLib.webpackMod.Stats,
    previousFileSizes: reactDashDevDashUtilsLib.filesizereporterMod.OpaqueFileSizes,
    buildFolder: java.lang.String
  ): scala.Unit = js.native
  def printFileSizesAfterBuild(
    webpackStats: webpackLib.webpackMod.Stats,
    previousFileSizes: reactDashDevDashUtilsLib.filesizereporterMod.OpaqueFileSizes,
    buildFolder: java.lang.String,
    maxBundleGzipSize: scala.Double
  ): scala.Unit = js.native
  def printFileSizesAfterBuild(
    webpackStats: webpackLib.webpackMod.Stats,
    previousFileSizes: reactDashDevDashUtilsLib.filesizereporterMod.OpaqueFileSizes,
    buildFolder: java.lang.String,
    maxBundleGzipSize: scala.Double,
    maxChunkGzipSize: scala.Double
  ): scala.Unit = js.native
}

