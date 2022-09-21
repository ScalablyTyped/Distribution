package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsWatchResults extends StObject {
  
  var dirsAdded: js.Array[String]
  
  var dirsDeleted: js.Array[String]
  
  var filesAdded: js.Array[String]
  
  var filesDeleted: js.Array[String]
  
  var filesUpdated: js.Array[String]
}
object FsWatchResults {
  
  inline def apply(
    dirsAdded: js.Array[String],
    dirsDeleted: js.Array[String],
    filesAdded: js.Array[String],
    filesDeleted: js.Array[String],
    filesUpdated: js.Array[String]
  ): FsWatchResults = {
    val __obj = js.Dynamic.literal(dirsAdded = dirsAdded.asInstanceOf[js.Any], dirsDeleted = dirsDeleted.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesDeleted = filesDeleted.asInstanceOf[js.Any], filesUpdated = filesUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsWatchResults]
  }
  
  extension [Self <: FsWatchResults](x: Self) {
    
    inline def setDirsAdded(value: js.Array[String]): Self = StObject.set(x, "dirsAdded", value.asInstanceOf[js.Any])
    
    inline def setDirsAddedVarargs(value: String*): Self = StObject.set(x, "dirsAdded", js.Array(value*))
    
    inline def setDirsDeleted(value: js.Array[String]): Self = StObject.set(x, "dirsDeleted", value.asInstanceOf[js.Any])
    
    inline def setDirsDeletedVarargs(value: String*): Self = StObject.set(x, "dirsDeleted", js.Array(value*))
    
    inline def setFilesAdded(value: js.Array[String]): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
    
    inline def setFilesAddedVarargs(value: String*): Self = StObject.set(x, "filesAdded", js.Array(value*))
    
    inline def setFilesDeleted(value: js.Array[String]): Self = StObject.set(x, "filesDeleted", value.asInstanceOf[js.Any])
    
    inline def setFilesDeletedVarargs(value: String*): Self = StObject.set(x, "filesDeleted", js.Array(value*))
    
    inline def setFilesUpdated(value: js.Array[String]): Self = StObject.set(x, "filesUpdated", value.asInstanceOf[js.Any])
    
    inline def setFilesUpdatedVarargs(value: String*): Self = StObject.set(x, "filesUpdated", js.Array(value*))
  }
}
