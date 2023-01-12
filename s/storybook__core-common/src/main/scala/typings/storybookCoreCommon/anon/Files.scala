package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  var files: js.Array[Value]
}
object Files {
  
  inline def apply(files: js.Array[Value]): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[Value]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: Value*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
