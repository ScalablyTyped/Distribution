package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filepaths extends StObject {
  
  var confidence: Double
  
  var file_paths: js.Array[String]
}
object Filepaths {
  
  inline def apply(confidence: Double, file_paths: js.Array[String]): Filepaths = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], file_paths = file_paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filepaths]
  }
  
  extension [Self <: Filepaths](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setFile_paths(value: js.Array[String]): Self = StObject.set(x, "file_paths", value.asInstanceOf[js.Any])
    
    inline def setFile_pathsVarargs(value: String*): Self = StObject.set(x, "file_paths", js.Array(value*))
  }
}
