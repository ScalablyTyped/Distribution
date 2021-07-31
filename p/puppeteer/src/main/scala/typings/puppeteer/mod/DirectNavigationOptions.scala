package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectNavigationOptions
  extends StObject
     with NavigationOptions {
  
  /**
    * Referer header value.
    * If provided it will take preference over the referer header value set by
    * [page.setExtraHTTPHeaders()](#pagesetextrahttpheadersheaders).
    */
  var referer: js.UndefOr[String] = js.undefined
}
object DirectNavigationOptions {
  
  @scala.inline
  def apply(): DirectNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectNavigationOptions]
  }
  
  @scala.inline
  implicit class DirectNavigationOptionsMutableBuilder[Self <: DirectNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
  }
}
