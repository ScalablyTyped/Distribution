package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropResult extends StObject {
  
  var dropped: Double = js.native
}
object DropResult {
  
  @scala.inline
  def apply(dropped: Double): DropResult = {
    val __obj = js.Dynamic.literal(dropped = dropped.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
  
  @scala.inline
  implicit class DropResultMutableBuilder[Self <: DropResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropped(value: Double): Self = StObject.set(x, "dropped", value.asInstanceOf[js.Any])
  }
}
