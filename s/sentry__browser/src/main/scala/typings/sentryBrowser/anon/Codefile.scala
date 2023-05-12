package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codefile extends StObject {
  
  var code_file: String
  
  var debug_id: String
  
  var image_addr: String
  
  var image_size: Double
  
  var image_vmaddr: String
  
  var `type`: String
}
object Codefile {
  
  inline def apply(
    code_file: String,
    debug_id: String,
    image_addr: String,
    image_size: Double,
    image_vmaddr: String,
    `type`: String
  ): Codefile = {
    val __obj = js.Dynamic.literal(code_file = code_file.asInstanceOf[js.Any], debug_id = debug_id.asInstanceOf[js.Any], image_addr = image_addr.asInstanceOf[js.Any], image_size = image_size.asInstanceOf[js.Any], image_vmaddr = image_vmaddr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codefile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Codefile] (val x: Self) extends AnyVal {
    
    inline def setCode_file(value: String): Self = StObject.set(x, "code_file", value.asInstanceOf[js.Any])
    
    inline def setDebug_id(value: String): Self = StObject.set(x, "debug_id", value.asInstanceOf[js.Any])
    
    inline def setImage_addr(value: String): Self = StObject.set(x, "image_addr", value.asInstanceOf[js.Any])
    
    inline def setImage_size(value: Double): Self = StObject.set(x, "image_size", value.asInstanceOf[js.Any])
    
    inline def setImage_vmaddr(value: String): Self = StObject.set(x, "image_vmaddr", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
