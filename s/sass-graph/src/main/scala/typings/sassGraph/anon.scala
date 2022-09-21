package typings.sassGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ImportedBy extends StObject {
    
    var importedBy: js.Array[String]
    
    var imports: js.Array[String]
    
    var modified: String
  }
  object ImportedBy {
    
    inline def apply(importedBy: js.Array[String], imports: js.Array[String], modified: String): ImportedBy = {
      val __obj = js.Dynamic.literal(importedBy = importedBy.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportedBy]
    }
    
    extension [Self <: ImportedBy](x: Self) {
      
      inline def setImportedBy(value: js.Array[String]): Self = StObject.set(x, "importedBy", value.asInstanceOf[js.Any])
      
      inline def setImportedByVarargs(value: String*): Self = StObject.set(x, "importedBy", js.Array(value*))
      
      inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
}
