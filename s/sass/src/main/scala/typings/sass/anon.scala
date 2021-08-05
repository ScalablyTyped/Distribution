package typings.sass

import typings.sass.mod._ImporterReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contents
    extends StObject
       with _ImporterReturnType {
    
    var contents: String
  }
  object Contents {
    
    inline def apply(contents: String): Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    extension [Self <: Contents](x: Self) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    }
  }
  
  trait Duration extends StObject {
    
    /**
      * `end - start`
      */
    var duration: Double
    
    /**
      * `Date.now()` after the compilation.
      */
    var end: Double
    
    /**
      * The path to the scss file, or `data` if the source was not a file.
      */
    var entry: String
    
    /**
      * Absolute paths to all related files in no particular order.
      */
    var includedFiles: js.Array[String]
    
    /**
      * `Date.now()` before the compilation.
      */
    var start: Double
  }
  object Duration {
    
    inline def apply(duration: Double, end: Double, entry: String, includedFiles: js.Array[String], start: Double): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setIncludedFiles(value: js.Array[String]): Self = StObject.set(x, "includedFiles", value.asInstanceOf[js.Any])
      
      inline def setIncludedFilesVarargs(value: String*): Self = StObject.set(x, "includedFiles", js.Array(value :_*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait File
    extends StObject
       with _ImporterReturnType {
    
    var file: String
  }
  object File {
    
    inline def apply(file: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
