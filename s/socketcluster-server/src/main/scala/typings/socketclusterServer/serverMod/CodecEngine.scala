package typings.socketclusterServer.serverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodecEngine extends StObject {
  
  def decode(input: Any): Any
  
  def encode(`object`: Any): Any
}
object CodecEngine {
  
  inline def apply(decode: Any => Any, encode: Any => Any): CodecEngine = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[CodecEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodecEngine] (val x: Self) extends AnyVal {
    
    inline def setDecode(value: Any => Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: Any => Any): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
