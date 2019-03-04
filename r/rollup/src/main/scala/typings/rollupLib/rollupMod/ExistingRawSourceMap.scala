package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistingRawSourceMap extends RawSourceMap {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var mappings: java.lang.String
  var names: js.Array[java.lang.String]
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: scala.Double
}

object ExistingRawSourceMap {
  @scala.inline
  def apply(
    mappings: java.lang.String,
    names: js.Array[java.lang.String],
    sources: js.Array[java.lang.String],
    version: scala.Double,
    file: java.lang.String = null,
    sourceRoot: java.lang.String = null,
    sourcesContent: js.Array[java.lang.String] = null
  ): ExistingRawSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings, names = names, sources = sources, version = version)
    if (file != null) __obj.updateDynamic("file")(file)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[ExistingRawSourceMap]
  }
}

