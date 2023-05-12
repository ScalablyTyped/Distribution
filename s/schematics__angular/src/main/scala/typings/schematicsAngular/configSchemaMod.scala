package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configSchemaMod {
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("@schematics/angular/config/schema", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type & String] = js.native
    
    @js.native
    sealed trait Browserslist
      extends StObject
         with Type
    /* "browserslist" */ val Browserslist: typings.schematicsAngular.configSchemaMod.Type.Browserslist & String = js.native
    
    @js.native
    sealed trait Karma
      extends StObject
         with Type
    /* "karma" */ val Karma: typings.schematicsAngular.configSchemaMod.Type.Karma & String = js.native
  }
  
  trait Schema extends StObject {
    
    /**
      * The name of the project.
      */
    var project: String
    
    /**
      * Specifies which type of configuration file to create.
      */
    var `type`: Type
  }
  object Schema {
    
    inline def apply(project: String, `type`: Type): Schema = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
