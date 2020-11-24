package typings.rollup.mod

import typings.rollup.rollupStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SourceMapInput extends js.Object
object _SourceMapInput {
  
  @scala.inline
  def ExistingRawSourceMap(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double): _SourceMapInput = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SourceMapInput]
  }
  
  @scala.inline
  def `0`(mappings: _empty): _SourceMapInput = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SourceMapInput]
  }
}
