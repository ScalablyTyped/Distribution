package typings.reactDashDevDashUtils.fileSizeReporterMod

import typings.webpack.webpackMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/FileSizeReporter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def measureFileSizesBeforeBuild(buildFolder: String): js.Promise[OpaqueFileSizes] = js.native
  def printFileSizesAfterBuild(webpackStats: Stats, previousFileSizes: OpaqueFileSizes, buildFolder: String): Unit = js.native
  def printFileSizesAfterBuild(
    webpackStats: Stats,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String,
    maxBundleGzipSize: Double
  ): Unit = js.native
  def printFileSizesAfterBuild(
    webpackStats: Stats,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String,
    maxBundleGzipSize: Double,
    maxChunkGzipSize: Double
  ): Unit = js.native
}

