package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentsSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The name of the project.
      */
    var project: String
  }
  object Schema {
    
    inline def apply(project: String): Schema = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
