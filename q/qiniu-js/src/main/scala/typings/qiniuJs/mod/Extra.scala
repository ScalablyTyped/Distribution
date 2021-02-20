package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extra extends StObject {
  
  var fname: String = js.native
  
  // 用来放置自定义变量
  var mimeType: js.Array[String] | Null = js.native
  
  // 文件原文件名
  var params: js.Any = js.native
}
object Extra {
  
  @scala.inline
  def apply(fname: String, params: js.Any): Extra = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  @scala.inline
  implicit class ExtraMutableBuilder[Self <: Extra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    @scala.inline
    def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
