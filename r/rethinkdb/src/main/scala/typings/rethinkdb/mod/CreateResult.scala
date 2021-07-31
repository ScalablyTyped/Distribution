package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResult extends StObject {
  
  var created: Double
}
object CreateResult {
  
  @scala.inline
  def apply(created: Double): CreateResult = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResult]
  }
  
  @scala.inline
  implicit class CreateResultMutableBuilder[Self <: CreateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
  }
}
