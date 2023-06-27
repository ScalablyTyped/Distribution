package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingObserverOptions extends StObject {
  
  /* standard dom */
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}
object ReportingObserverOptions {
  
  inline def apply(): ReportingObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingObserverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportingObserverOptions] (val x: Self) extends AnyVal {
    
    inline def setBuffered(value: scala.Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    inline def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
