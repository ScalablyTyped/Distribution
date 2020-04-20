package typings.rollup.mod

import typings.rollup.rollupStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SourceMapInput extends js.Object

object _SourceMapInput {
  @scala.inline
  def ExistingRawSourceMap(
    mappings: String,
    names: js.Array[String],
    sources: js.Array[String],
    version: Double,
    file: String = null,
    sourceRoot: String = null,
    sourcesContent: js.Array[String] = null
  ): _SourceMapInput = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SourceMapInput]
  }
  @scala.inline
  def AnonMappings(mappings: _empty): _SourceMapInput = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SourceMapInput]
  }
}

