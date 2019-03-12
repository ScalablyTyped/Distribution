package typings
package reactDashDevDashUtilsLib.fileSizeReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/FileSizeReporter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def measureFileSizesBeforeBuild(buildFolder: java.lang.String): js.Promise[OpaqueFileSizes] = js.native
  def printFileSizesAfterBuild(
    webpackStats: webpackLib.webpackMod.Stats,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: java.lang.String
  ): scala.Unit = js.native
  def printFileSizesAfterBuild(
    webpackStats: webpackLib.webpackMod.Stats,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: java.lang.String,
    maxBundleGzipSize: scala.Double
  ): scala.Unit = js.native
  def printFileSizesAfterBuild(
    webpackStats: webpackLib.webpackMod.Stats,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: java.lang.String,
    maxBundleGzipSize: scala.Double,
    maxChunkGzipSize: scala.Double
  ): scala.Unit = js.native
}

