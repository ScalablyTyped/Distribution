package typings.sentryCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Projects extends StObject {
    
    var projects: js.Array[String]
  }
  object Projects {
    
    inline def apply(projects: js.Array[String]): Projects = {
      val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Projects]
    }
    
    extension [Self <: Projects](x: Self) {
      
      inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value*))
    }
  }
}
