package typings.speedMeasureWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilePath extends StObject {
    
    var filePath: String
  }
  object FilePath {
    
    inline def apply(filePath: String): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePath]
    }
    
    extension [Self <: FilePath](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
}
