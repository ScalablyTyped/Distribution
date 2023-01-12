package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexSourceMap
  extends StObject
     with MixedSourceMap {
  
  val file: js.UndefOr[String] = js.undefined
  
  /** avoids SourceMap being a disjoint union */
  val mappings: Unit
  
  val sections: js.Array[IndexSourceMapSection]
  
  val sourcesContent: Unit
  
  val version: Double
  
  val x_facebook_sources: js.UndefOr[FBSourcesArray] = js.undefined
  
  val x_react_sources: js.UndefOr[ReactSourcesArray] = js.undefined
}
object IndexSourceMap {
  
  inline def apply(mappings: Unit, sections: js.Array[IndexSourceMapSection], sourcesContent: Unit, version: Double): IndexSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSourceMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexSourceMap] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMappings(value: Unit): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[IndexSourceMapSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: IndexSourceMapSection*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setSourcesContent(value: Unit): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setX_facebook_sources(value: FBSourcesArray): Self = StObject.set(x, "x_facebook_sources", value.asInstanceOf[js.Any])
    
    inline def setX_facebook_sourcesUndefined: Self = StObject.set(x, "x_facebook_sources", js.undefined)
    
    inline def setX_facebook_sourcesVarargs(value: (js.UndefOr[FBSourceMetadata | Null])*): Self = StObject.set(x, "x_facebook_sources", js.Array(value*))
    
    inline def setX_react_sources(value: ReactSourcesArray): Self = StObject.set(x, "x_react_sources", value.asInstanceOf[js.Any])
    
    inline def setX_react_sourcesUndefined: Self = StObject.set(x, "x_react_sources", js.undefined)
    
    inline def setX_react_sourcesVarargs(value: (js.UndefOr[ReactSourceMetadata | Null])*): Self = StObject.set(x, "x_react_sources", js.Array(value*))
  }
}
