package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  var Group: `30`
  
  var Row: `31`
}
object Row {
  
  inline def apply(Group: `30`, Row: `31`): Row = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setGroup(value: `30`): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setRow(value: `31`): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
  }
}
