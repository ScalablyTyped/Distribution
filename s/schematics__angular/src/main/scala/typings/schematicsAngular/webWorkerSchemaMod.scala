package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webWorkerSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The name of the worker.
      */
    var name: String
    
    /**
      * The path at which to create the worker file, relative to the current workspace.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: String
    
    /**
      * Add a worker creation snippet in a sibling file of the same name.
      */
    var snippet: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(name: String, project: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setSnippet(value: Boolean): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
      
      inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    }
  }
}
