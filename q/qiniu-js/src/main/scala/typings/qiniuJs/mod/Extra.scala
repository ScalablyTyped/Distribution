package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  var fname: String
  
  // 用来放置自定义变量
  var mimeType: js.Array[String] | Null
  
  // 文件原文件名
  var params: js.Any
}
object Extra {
  
  inline def apply(fname: String, params: js.Any): Extra = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], mimeType = null)
    __obj.asInstanceOf[Extra]
  }
  
  extension [Self <: Extra](x: Self) {
    
    inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value :_*))
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
