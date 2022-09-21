package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object e2eSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The name of the application being tested.
      */
    var relatedAppName: String
    
    /**
      * The HTML selector for the root component of the test app.
      */
    var rootSelector: js.UndefOr[String] = js.undefined
  }
  object Schema {
    
    inline def apply(relatedAppName: String): Schema = {
      val __obj = js.Dynamic.literal(relatedAppName = relatedAppName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setRelatedAppName(value: String): Self = StObject.set(x, "relatedAppName", value.asInstanceOf[js.Any])
      
      inline def setRootSelector(value: String): Self = StObject.set(x, "rootSelector", value.asInstanceOf[js.Any])
      
      inline def setRootSelectorUndefined: Self = StObject.set(x, "rootSelector", js.undefined)
    }
  }
}
