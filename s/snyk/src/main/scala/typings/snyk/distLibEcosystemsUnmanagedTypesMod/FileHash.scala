package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileHash extends StObject {
  
  var hashes_ffm: js.Array[HashFormat]
  
  var path: String
  
  var size: Double
}
object FileHash {
  
  inline def apply(hashes_ffm: js.Array[HashFormat], path: String, size: Double): FileHash = {
    val __obj = js.Dynamic.literal(hashes_ffm = hashes_ffm.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHash]
  }
  
  extension [Self <: FileHash](x: Self) {
    
    inline def setHashes_ffm(value: js.Array[HashFormat]): Self = StObject.set(x, "hashes_ffm", value.asInstanceOf[js.Any])
    
    inline def setHashes_ffmVarargs(value: HashFormat*): Self = StObject.set(x, "hashes_ffm", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
