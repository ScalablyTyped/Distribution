package typings.sourceDashMap.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawSourceMap extends js.Object {
  var file: String
  var mappings: String
  var names: js.Array[String]
  var sourceRoot: js.UndefOr[String] = js.undefined
  var sources: js.Array[String]
  var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
  var version: Double
}

object RawSourceMap {
  @scala.inline
  def apply(
    file: String,
    mappings: String,
    names: js.Array[String],
    sources: js.Array[String],
    version: Double,
    sourceRoot: String = null,
    sourcesContent: js.Array[String] = null
  ): RawSourceMap = {
    val __obj = js.Dynamic.literal(file = file, mappings = mappings, names = names, sources = sources, version = version)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[RawSourceMap]
  }
}

