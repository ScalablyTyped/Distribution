package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistingDecodedSourceMap
  extends StObject
     with DecodedSourceMapOrMissing {
  
  var file: js.UndefOr[String] = js.undefined
  
  var mappings: js.Array[js.Array[SourceMapSegment]]
  
  var names: js.Array[String]
  
  var sourceRoot: js.UndefOr[String] = js.undefined
  
  var sources: js.Array[String]
  
  var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.undefined
  
  var version: Double
  
  var x_google_ignoreList: js.UndefOr[js.Array[Double]] = js.undefined
}
object ExistingDecodedSourceMap {
  
  inline def apply(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double
  ): ExistingDecodedSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingDecodedSourceMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExistingDecodedSourceMap] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMappings(value: js.Array[js.Array[SourceMapSegment]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = StObject.set(x, "mappings", js.Array(value*))
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
    
    inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setX_google_ignoreList(value: js.Array[Double]): Self = StObject.set(x, "x_google_ignoreList", value.asInstanceOf[js.Any])
    
    inline def setX_google_ignoreListUndefined: Self = StObject.set(x, "x_google_ignoreList", js.undefined)
    
    inline def setX_google_ignoreListVarargs(value: Double*): Self = StObject.set(x, "x_google_ignoreList", js.Array(value*))
  }
}
