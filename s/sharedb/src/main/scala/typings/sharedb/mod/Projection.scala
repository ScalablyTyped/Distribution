package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends StObject {
  
  var fields: ProjectionFields = js.native
  
  var target: String = js.native
}
object Projection {
  
  @scala.inline
  def apply(fields: ProjectionFields, target: String): Projection = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: ProjectionFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
