package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/browser.@sentry/browser/types/integrations/linkederrors.LinkedErrorsOptions> */
trait PartialLinkedErrorsOption extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
}
object PartialLinkedErrorsOption {
  
  inline def apply(): PartialLinkedErrorsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLinkedErrorsOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLinkedErrorsOption] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
