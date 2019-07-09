package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistingDecodedSourceMap extends DecodedSourceMapOrMissing {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var mappings: js.Array[js.Array[SourceMapSegment]]
  var names: js.Array[java.lang.String]
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: scala.Double
}

object ExistingDecodedSourceMap {
  @scala.inline
  def apply(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[java.lang.String],
    sources: js.Array[java.lang.String],
    version: scala.Double,
    file: java.lang.String = null,
    sourceRoot: java.lang.String = null,
    sourcesContent: js.Array[java.lang.String] = null
  ): ExistingDecodedSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings, names = names, sources = sources, version = version)
    if (file != null) __obj.updateDynamic("file")(file)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[ExistingDecodedSourceMap]
  }
}

