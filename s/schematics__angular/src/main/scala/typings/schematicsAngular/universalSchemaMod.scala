package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object universalSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The name of the application folder.
      * @deprecated This option has no effect.
      */
    var appDir: js.UndefOr[String] = js.undefined
    
    /**
      * The application identifier to use for transition.
      */
    var appId: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the main entry-point file.
      */
    var main: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: String
    
    /**
      * The name of the root NgModule class.
      */
    var rootModuleClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the root NgModule file.
      */
    var rootModuleFileName: js.UndefOr[String] = js.undefined
    
    /**
      * Do not install packages for dependencies.
      */
    var skipInstall: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(project: String): Schema = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setRootModuleClassName(value: String): Self = StObject.set(x, "rootModuleClassName", value.asInstanceOf[js.Any])
      
      inline def setRootModuleClassNameUndefined: Self = StObject.set(x, "rootModuleClassName", js.undefined)
      
      inline def setRootModuleFileName(value: String): Self = StObject.set(x, "rootModuleFileName", value.asInstanceOf[js.Any])
      
      inline def setRootModuleFileNameUndefined: Self = StObject.set(x, "rootModuleFileName", js.undefined)
      
      inline def setSkipInstall(value: Boolean): Self = StObject.set(x, "skipInstall", value.asInstanceOf[js.Any])
      
      inline def setSkipInstallUndefined: Self = StObject.set(x, "skipInstall", js.undefined)
    }
  }
}
