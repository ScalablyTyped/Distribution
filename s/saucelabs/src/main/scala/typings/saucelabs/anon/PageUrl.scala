package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageUrl extends StObject {
  
  var pageUrl: js.UndefOr[String] = js.undefined
}
object PageUrl {
  
  inline def apply(): PageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageUrl] (val x: Self) extends AnyVal {
    
    inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
  }
}
