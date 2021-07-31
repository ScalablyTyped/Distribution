package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupTotals[T]
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
  
  @scala.inline
  def apply[T](group: Group[T]): GroupTotals[T] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTotals[T]]
  }
  
  @scala.inline
  implicit class GroupTotalsMutableBuilder[Self <: GroupTotals[?], T] (val x: Self & GroupTotals[T]) extends AnyVal {
    
    @scala.inline
    def setGroup(value: Group[T]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
