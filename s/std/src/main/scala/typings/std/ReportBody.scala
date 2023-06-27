package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportBody) */
trait ReportBody extends StObject {
  
  /* standard dom */
  def toJSON(): Any
}
object ReportBody {
  
  inline def apply(toJSON: () => Any): ReportBody = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ReportBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportBody] (val x: Self) extends AnyVal {
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
