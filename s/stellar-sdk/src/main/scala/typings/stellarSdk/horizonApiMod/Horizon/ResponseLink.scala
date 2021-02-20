package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseLink extends StObject {
  
  var href: String = js.native
  
  var templated: js.UndefOr[Boolean] = js.native
}
object ResponseLink {
  
  @scala.inline
  def apply(href: String): ResponseLink = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseLink]
  }
  
  @scala.inline
  implicit class ResponseLinkMutableBuilder[Self <: ResponseLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplated(value: Boolean): Self = StObject.set(x, "templated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatedUndefined: Self = StObject.set(x, "templated", js.undefined)
  }
}
