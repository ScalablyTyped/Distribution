package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QFolder extends StObject {
  
  var qFolder: String
}
object QFolder {
  
  inline def apply(qFolder: String): QFolder = {
    val __obj = js.Dynamic.literal(qFolder = qFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFolder]
  }
  
  extension [Self <: QFolder](x: Self) {
    
    inline def setQFolder(value: String): Self = StObject.set(x, "qFolder", value.asInstanceOf[js.Any])
  }
}
