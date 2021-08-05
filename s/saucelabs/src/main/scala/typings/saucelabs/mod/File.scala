package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var md5: String
  
  var mtime: String
  
  var name: String
  
  var size: Double
}
object File {
  
  inline def apply(md5: String, mtime: String, name: String, size: Double): File = {
    val __obj = js.Dynamic.literal(md5 = md5.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: String): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
