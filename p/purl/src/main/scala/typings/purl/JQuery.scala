package typings.purl

import typings.purl.mod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /** 
    * extract the URL from the selected element and parse that - will work on any element with a `src`, `href` or `action` attribute.
    */
  def url(): Url
}
object JQuery {
  
  inline def apply(url: () => Url): JQuery = {
    val __obj = js.Dynamic.literal(url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: () => Url): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
  }
}
