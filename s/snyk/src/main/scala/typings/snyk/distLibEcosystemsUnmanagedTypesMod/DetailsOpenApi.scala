package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsOpenApi extends StObject {
  
  var artifact: String
  
  var author: String
  
  var file_paths: js.Array[String]
  
  var id: String
  
  var path: String
  
  var score: Double
  
  var url: String
  
  var version: String
}
object DetailsOpenApi {
  
  inline def apply(
    artifact: String,
    author: String,
    file_paths: js.Array[String],
    id: String,
    path: String,
    score: Double,
    url: String,
    version: String
  ): DetailsOpenApi = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], file_paths = file_paths.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailsOpenApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailsOpenApi] (val x: Self) extends AnyVal {
    
    inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setFile_paths(value: js.Array[String]): Self = StObject.set(x, "file_paths", value.asInstanceOf[js.Any])
    
    inline def setFile_pathsVarargs(value: String*): Self = StObject.set(x, "file_paths", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
