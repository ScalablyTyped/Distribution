package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colspan extends StObject {
  
  var colspan: Double
  
  var rowspan: Double
}
object Colspan {
  
  inline def apply(colspan: Double, rowspan: Double): Colspan = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colspan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Colspan] (val x: Self) extends AnyVal {
    
    inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
  }
}
