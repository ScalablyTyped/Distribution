package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The name of the new class.
      */
    var name: String
    
    /**
      * The path at which to create the class, relative to the workspace root.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * Do not create "spec.ts" test files for the new class.
      */
    var skipTests: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
      
      inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
