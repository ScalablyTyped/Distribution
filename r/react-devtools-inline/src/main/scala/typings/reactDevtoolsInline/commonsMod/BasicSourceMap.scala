package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicSourceMap
  extends StObject
     with MixedSourceMap {
  
  val file: js.UndefOr[String] = js.undefined
  
  val mappings: String
  
  val names: js.Array[String]
  
  val sourceRoot: js.UndefOr[String] = js.undefined
  
  val sources: js.Array[String]
  
  val sourcesContent: js.UndefOr[js.Array[js.UndefOr[String | Null]]] = js.undefined
  
  val version: Double
  
  val x_facebook_sources: js.UndefOr[FBSourcesArray] = js.undefined
  
  val x_react_sources: js.UndefOr[ReactSourcesArray] = js.undefined
}
object BasicSourceMap {
  
  inline def apply(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double): BasicSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicSourceMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicSourceMap] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesContent(value: js.Array[js.UndefOr[String | Null]]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
    
    inline def setSourcesContentVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setX_facebook_sources(value: FBSourcesArray): Self = StObject.set(x, "x_facebook_sources", value.asInstanceOf[js.Any])
    
    inline def setX_facebook_sourcesUndefined: Self = StObject.set(x, "x_facebook_sources", js.undefined)
    
    inline def setX_facebook_sourcesVarargs(value: (js.UndefOr[FBSourceMetadata | Null])*): Self = StObject.set(x, "x_facebook_sources", js.Array(value*))
    
    inline def setX_react_sources(value: ReactSourcesArray): Self = StObject.set(x, "x_react_sources", value.asInstanceOf[js.Any])
    
    inline def setX_react_sourcesUndefined: Self = StObject.set(x, "x_react_sources", js.undefined)
    
    inline def setX_react_sourcesVarargs(value: (js.UndefOr[ReactSourceMetadata | Null])*): Self = StObject.set(x, "x_react_sources", js.Array(value*))
  }
}
