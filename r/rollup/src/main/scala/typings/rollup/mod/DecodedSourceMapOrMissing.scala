package typings.rollup.mod

import typings.rollup.rollupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rollup.anon.Mappings
  - typings.rollup.mod.ExistingDecodedSourceMap
*/
trait DecodedSourceMapOrMissing extends js.Object
object DecodedSourceMapOrMissing {
  
  @scala.inline
  def Mappings(missing: `true`, plugin: String): DecodedSourceMapOrMissing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedSourceMapOrMissing]
  }
  
  @scala.inline
  def ExistingDecodedSourceMap(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double
  ): DecodedSourceMapOrMissing = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedSourceMapOrMissing]
  }
}
