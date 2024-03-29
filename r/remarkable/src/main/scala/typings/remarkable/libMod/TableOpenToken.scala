package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.table_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TableOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_TableOpenToken: table_open
}
object TableOpenToken {
  
  inline def apply(level: Double): TableOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table_open")
    __obj.asInstanceOf[TableOpenToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableOpenToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: table_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
