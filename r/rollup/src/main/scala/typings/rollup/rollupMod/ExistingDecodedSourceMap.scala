package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistingDecodedSourceMap extends DecodedSourceMapOrMissing {
  var file: js.UndefOr[String] = js.undefined
  var mappings: js.Array[js.Array[SourceMapSegment]]
  var names: js.Array[String]
  var sourceRoot: js.UndefOr[String] = js.undefined
  var sources: js.Array[String]
  var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
  var version: Double
}

object ExistingDecodedSourceMap {
  @scala.inline
  def apply(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double,
    file: String = null,
    sourceRoot: String = null,
    sourcesContent: js.Array[String] = null
  ): ExistingDecodedSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings, names = names, sources = sources, version = version)
    if (file != null) __obj.updateDynamic("file")(file)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[ExistingDecodedSourceMap]
  }
}

