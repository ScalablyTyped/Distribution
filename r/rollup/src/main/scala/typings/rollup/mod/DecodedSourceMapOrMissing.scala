package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rollup.anon.Mappings
  - typings.rollup.mod.ExistingDecodedSourceMap
*/
trait DecodedSourceMapOrMissing extends StObject
object DecodedSourceMapOrMissing {
  
  @scala.inline
  def ExistingDecodedSourceMap(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double
  ): typings.rollup.mod.ExistingDecodedSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.mod.ExistingDecodedSourceMap]
  }
  
  @scala.inline
  def Mappings(plugin: String): typings.rollup.anon.Mappings = {
    val __obj = js.Dynamic.literal(missing = true, plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rollup.anon.Mappings]
  }
}
