package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cseq extends StObject {
  
  var body: js.UndefOr[typings.sipJs.libCoreMessagesBodyMod.Body] = js.undefined
  
  var cseq: js.UndefOr[Double] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}
object Cseq {
  
  inline def apply(): Cseq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cseq]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cseq] (val x: Self) extends AnyVal {
    
    inline def setBody(value: typings.sipJs.libCoreMessagesBodyMod.Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCseq(value: Double): Self = StObject.set(x, "cseq", value.asInstanceOf[js.Any])
    
    inline def setCseqUndefined: Self = StObject.set(x, "cseq", js.undefined)
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value*))
  }
}
