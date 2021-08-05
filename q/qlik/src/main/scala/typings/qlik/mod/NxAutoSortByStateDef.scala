package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxAutoSortByStateDef extends StObject {
  
  var qDisplayNumberOfRows: Double
}
object NxAutoSortByStateDef {
  
  inline def apply(qDisplayNumberOfRows: Double): NxAutoSortByStateDef = {
    val __obj = js.Dynamic.literal(qDisplayNumberOfRows = qDisplayNumberOfRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAutoSortByStateDef]
  }
  
  extension [Self <: NxAutoSortByStateDef](x: Self) {
    
    inline def setQDisplayNumberOfRows(value: Double): Self = StObject.set(x, "qDisplayNumberOfRows", value.asInstanceOf[js.Any])
  }
}
