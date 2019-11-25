package typings.rollup.rollupMod

import typings.rollup.rollupNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rollup.Anon_Missing
  - typings.rollup.rollupMod.ExistingDecodedSourceMap
*/
trait DecodedSourceMapOrMissing extends js.Object

object DecodedSourceMapOrMissing {
  @scala.inline
  def Anon_Missing(missing: `true`, plugin: String): DecodedSourceMapOrMissing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecodedSourceMapOrMissing]
  }
  @scala.inline
  def ExistingDecodedSourceMap(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double,
    file: String = null,
    sourceRoot: String = null,
    sourcesContent: js.Array[String] = null
  ): DecodedSourceMapOrMissing = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedSourceMapOrMissing]
  }
}

