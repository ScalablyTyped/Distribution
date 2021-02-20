package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplacedBy extends StObject {
  
  var point: Position = js.native
  
  var value: Double = js.native
}
object DisplacedBy {
  
  @scala.inline
  def apply(point: Position, value: Double): DisplacedBy = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacedBy]
  }
  
  @scala.inline
  implicit class DisplacedByMutableBuilder[Self <: DisplacedBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoint(value: Position): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
