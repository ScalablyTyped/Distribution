package typings.sentryReplay.typesTypesMod

import typings.sentryTypes.typesBreadcrumbMod.XhrBreadcrumbHint
import typings.sentryTypes.typesInstrumentMod.SentryWrappedXMLHttpRequest
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XhrHint
  extends StObject
     with XhrBreadcrumbHint {
  
  @JSName("input")
  var input_XhrHint: js.UndefOr[RequestBody] = js.undefined
  
  @JSName("xhr")
  var xhr_XhrHint: XMLHttpRequest & SentryWrappedXMLHttpRequest
}
object XhrHint {
  
  inline def apply(endTimestamp: Double, startTimestamp: Double, xhr: XMLHttpRequest & SentryWrappedXMLHttpRequest): XhrHint = {
    val __obj = js.Dynamic.literal(endTimestamp = endTimestamp.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[XhrHint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XhrHint] (val x: Self) extends AnyVal {
    
    inline def setInput(value: RequestBody): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputNull: Self = StObject.set(x, "input", null)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setXhr(value: XMLHttpRequest & SentryWrappedXMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}
