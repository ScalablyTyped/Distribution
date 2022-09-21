package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The name of the interface.
      */
    var name: String
    
    /**
      * The path at which to create the interface, relative to the workspace root.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * A prefix to apply to generated selectors.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * Adds a developer-defined type to the filename, in the format "name.type.ts".
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Schema {
    
    inline def apply(name: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
