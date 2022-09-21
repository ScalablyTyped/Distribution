package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceSchemaMod {
  
  @js.native
  sealed trait PackageManager extends StObject
  @JSImport("@schematics/angular/workspace/schema", "PackageManager")
  @js.native
  object PackageManager extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PackageManager & String] = js.native
    
    @js.native
    sealed trait Cnpm
      extends StObject
         with PackageManager
    /* "cnpm" */ val Cnpm: typings.schematicsAngular.workspaceSchemaMod.PackageManager.Cnpm & String = js.native
    
    @js.native
    sealed trait Npm
      extends StObject
         with PackageManager
    /* "npm" */ val Npm: typings.schematicsAngular.workspaceSchemaMod.PackageManager.Npm & String = js.native
    
    @js.native
    sealed trait Pnpm
      extends StObject
         with PackageManager
    /* "pnpm" */ val Pnpm: typings.schematicsAngular.workspaceSchemaMod.PackageManager.Pnpm & String = js.native
    
    @js.native
    sealed trait Yarn
      extends StObject
         with PackageManager
    /* "yarn" */ val Yarn: typings.schematicsAngular.workspaceSchemaMod.PackageManager.Yarn & String = js.native
  }
  
  trait Schema extends StObject {
    
    /**
      * Create a workspace without any testing frameworks. (Use for learning purposes only.)
      */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the workspace.
      */
    var name: String
    
    /**
      * The path where new projects will be created.
      */
    var newProjectRoot: js.UndefOr[String] = js.undefined
    
    /**
      * The package manager used to install dependencies.
      */
    var packageManager: js.UndefOr[PackageManager] = js.undefined
    
    /**
      * Create a workspace with stricter type checking options. This setting helps improve
      * maintainability and catch bugs ahead of time. For more information, see
      * https://angular.io/strict
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The version of the Angular CLI to use.
      */
    var version: String
  }
  object Schema {
    
    inline def apply(name: String, version: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewProjectRoot(value: String): Self = StObject.set(x, "newProjectRoot", value.asInstanceOf[js.Any])
      
      inline def setNewProjectRootUndefined: Self = StObject.set(x, "newProjectRoot", js.undefined)
      
      inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
      
      inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
