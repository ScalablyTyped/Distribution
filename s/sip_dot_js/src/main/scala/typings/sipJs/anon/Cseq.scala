package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cseq extends StObject {
  
  var body: js.UndefOr[typings.sipJs.bodyMod.Body] = js.undefined
  
  var cseq: js.UndefOr[Double] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}
object Cseq {
  
  @scala.inline
  def apply(): Cseq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cseq]
  }
  
  @scala.inline
  implicit class CseqMutableBuilder[Self <: Cseq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: typings.sipJs.bodyMod.Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCseq(value: Double): Self = StObject.set(x, "cseq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCseqUndefined: Self = StObject.set(x, "cseq", js.undefined)
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
  }
}
