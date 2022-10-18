package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confidence extends StObject {
  
  var confidence: Double
  
  var filePaths: js.Array[String]
}
object Confidence {
  
  inline def apply(confidence: Double, filePaths: js.Array[String]): Confidence = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confidence]
  }
  
  extension [Self <: Confidence](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setFilePaths(value: js.Array[String]): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
    
    inline def setFilePathsVarargs(value: String*): Self = StObject.set(x, "filePaths", js.Array(value*))
  }
}
