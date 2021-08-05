package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaSeriesProps
  extends StObject
     with AbstractSeriesProps[AreaSeriesPoint] {
  
  var getNull: js.UndefOr[RVGetNull[AreaSeriesPoint]] = js.undefined
}
object AreaSeriesProps {
  
  inline def apply(): AreaSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSeriesProps]
  }
  
  extension [Self <: AreaSeriesProps](x: Self) {
    
    inline def setGetNull(value: AreaSeriesPoint => js.Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    inline def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
  }
}
