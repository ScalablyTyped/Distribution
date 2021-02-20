package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxAutoSortByStateDef extends StObject {
  
  var qDisplayNumberOfRows: Double = js.native
}
object NxAutoSortByStateDef {
  
  @scala.inline
  def apply(qDisplayNumberOfRows: Double): NxAutoSortByStateDef = {
    val __obj = js.Dynamic.literal(qDisplayNumberOfRows = qDisplayNumberOfRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAutoSortByStateDef]
  }
  
  @scala.inline
  implicit class NxAutoSortByStateDefMutableBuilder[Self <: NxAutoSortByStateDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDisplayNumberOfRows(value: Double): Self = StObject.set(x, "qDisplayNumberOfRows", value.asInstanceOf[js.Any])
  }
}
