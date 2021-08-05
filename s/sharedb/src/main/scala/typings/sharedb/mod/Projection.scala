package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  var fields: ProjectionFields
  
  var target: String
}
object Projection {
  
  inline def apply(fields: ProjectionFields, target: String): Projection = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
  
  extension [Self <: Projection](x: Self) {
    
    inline def setFields(value: ProjectionFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
