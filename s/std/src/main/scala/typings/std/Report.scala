package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report) */
trait Report extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/body) */
  /* standard dom */
  val body: ReportBody | Null
  
  /* standard dom */
  def toJSON(): Any
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/type) */
  /* standard dom */
  val `type`: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/url) */
  /* standard dom */
  val url: java.lang.String
}
object Report {
  
  inline def apply(toJSON: () => Any, `type`: java.lang.String, url: java.lang.String): Report = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), url = url.asInstanceOf[js.Any], body = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
    
    inline def setBody(value: ReportBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
