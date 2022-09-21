package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  var Group: CallHasValueOnValueChangeChildrenDisplayNameString
  
  var Row: CallHasValueOnValueChangeChildrenStyle
}
object Row {
  
  inline def apply(
    Group: CallHasValueOnValueChangeChildrenDisplayNameString,
    Row: CallHasValueOnValueChangeChildrenStyle
  ): Row = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setGroup(value: CallHasValueOnValueChangeChildrenDisplayNameString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setRow(value: CallHasValueOnValueChangeChildrenStyle): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
  }
}
