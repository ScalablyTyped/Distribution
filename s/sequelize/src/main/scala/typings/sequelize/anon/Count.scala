package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count[TInstance] extends StObject {
  
  var count: Double = js.native
  
  var rows: js.Array[TInstance] = js.native
}
object Count {
  
  @scala.inline
  def apply[TInstance](count: Double, rows: js.Array[TInstance]): Count[TInstance] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count[TInstance]]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count[_], TInstance] (val x: Self with Count[TInstance]) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[TInstance]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: TInstance*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
