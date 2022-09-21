package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupTotals[T /* <: SlickData */]
  extends StObject
     with NonDataRow {
  
  /***
    * Parent Group.
    * @param group
    * @type {Group}
    */
  var group: Group[T]
}
object GroupTotals {
  
  inline def apply[T /* <: SlickData */](group: Group[T]): GroupTotals[T] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTotals[T]]
  }
  
  extension [Self <: GroupTotals[?], T /* <: SlickData */](x: Self & GroupTotals[T]) {
    
    inline def setGroup(value: Group[T]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
