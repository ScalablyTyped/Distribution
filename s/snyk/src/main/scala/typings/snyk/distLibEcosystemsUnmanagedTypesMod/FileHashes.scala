package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileHashes extends StObject {
  
  var hashes: js.Array[FileHash]
}
object FileHashes {
  
  inline def apply(hashes: js.Array[FileHash]): FileHashes = {
    val __obj = js.Dynamic.literal(hashes = hashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHashes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileHashes] (val x: Self) extends AnyVal {
    
    inline def setHashes(value: js.Array[FileHash]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesVarargs(value: FileHash*): Self = StObject.set(x, "hashes", js.Array(value*))
  }
}
