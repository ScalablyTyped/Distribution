package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * When true (the default), creates files at the top level of the project.
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the service.
      */
    var name: String
    
    /**
      * The path at which to create the service, relative to the workspace root.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: String
    
    /**
      * Do not create "spec.ts" test files for the new service.
      */
    var skipTests: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(name: String, project: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
      
      inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
    }
  }
}
