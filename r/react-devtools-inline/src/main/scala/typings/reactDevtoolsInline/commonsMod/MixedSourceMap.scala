package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactDevtoolsInline.commonsMod.IndexSourceMap
  - typings.reactDevtoolsInline.commonsMod.BasicSourceMap
*/
trait MixedSourceMap extends StObject
object MixedSourceMap {
  
  inline def BasicSourceMap(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double): typings.reactDevtoolsInline.commonsMod.BasicSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.BasicSourceMap]
  }
  
  inline def IndexSourceMap(mappings: Unit, sections: js.Array[IndexSourceMapSection], sourcesContent: Unit, version: Double): typings.reactDevtoolsInline.commonsMod.IndexSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.IndexSourceMap]
  }
}
