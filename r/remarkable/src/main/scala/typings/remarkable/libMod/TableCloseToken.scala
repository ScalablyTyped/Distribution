package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.table_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TableCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TableCloseToken: table_close
}
object TableCloseToken {
  
  inline def apply(level: Double): TableCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table_close")
    __obj.asInstanceOf[TableCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: table_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
