package typings.rollup.mod

import typings.rollup.rollupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SourceMapInput extends StObject
object _SourceMapInput {
  
  @scala.inline
  def `0`(mappings: _empty): typings.rollup.anon.`0` = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.`0`]
  }
  
  @scala.inline
  def ExistingRawSourceMap(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double): typings.rollup.mod.ExistingRawSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.mod.ExistingRawSourceMap]
  }
}
