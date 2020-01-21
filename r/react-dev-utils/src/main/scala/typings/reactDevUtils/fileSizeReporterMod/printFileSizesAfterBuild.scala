package typings.reactDevUtils.fileSizeReporterMod

import typings.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/FileSizeReporter", "printFileSizesAfterBuild")
@js.native
object printFileSizesAfterBuild extends js.Object {
  def apply(webpackStats: Stats, previousFileSizes: OpaqueFileSizes, buildFolder: String): Unit = js.native
  def apply(
    webpackStats: Stats,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String,
    maxBundleGzipSize: Double
  ): Unit = js.native
  def apply(
    webpackStats: Stats,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String,
    maxBundleGzipSize: Double,
    maxChunkGzipSize: Double
  ): Unit = js.native
}

