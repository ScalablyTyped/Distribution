package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.table_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait TableCloseToken extends TagToken {
  
  @JSName("type")
  var type_TableCloseToken: table_close = js.native
}
object TableCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: table_close): TableCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCloseToken]
  }
  
  @scala.inline
  implicit class TableCloseTokenMutableBuilder[Self <: TableCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: table_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
