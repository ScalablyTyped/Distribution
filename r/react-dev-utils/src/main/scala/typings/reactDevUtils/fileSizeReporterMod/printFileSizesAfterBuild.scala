package typings.reactDevUtils.fileSizeReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/FileSizeReporter", "printFileSizesAfterBuild")
@js.native
object printFileSizesAfterBuild extends js.Object {
  def apply(
    webpackStats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String
  ): Unit = js.native
  def apply(
    webpackStats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String,
    maxBundleGzipSize: js.UndefOr[scala.Nothing],
    maxChunkGzipSize: Double
  ): Unit = js.native
  def apply(
    webpackStats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String,
    maxBundleGzipSize: Double
  ): Unit = js.native
  def apply(
    webpackStats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any,
    previousFileSizes: OpaqueFileSizes,
    buildFolder: String,
    maxBundleGzipSize: Double,
    maxChunkGzipSize: Double
  ): Unit = js.native
}

