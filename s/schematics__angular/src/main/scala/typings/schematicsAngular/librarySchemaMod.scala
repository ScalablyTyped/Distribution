package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librarySchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The path at which to create the library's public API file, relative to the workspace root.
      */
    var entryFile: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the library.
      */
    var name: String
    
    /**
      * A prefix to apply to generated selectors.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The root directory of the new library.
      */
    var projectRoot: js.UndefOr[String] = js.undefined
    
    /**
      * Do not install dependency packages.
      */
    var skipInstall: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not add dependencies to the "package.json" file.
      */
    var skipPackageJson: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not update "tsconfig.json" to add a path mapping for the new library. The path mapping
      * is needed to use the library in an app, but can be disabled here to simplify development.
      */
    var skipTsConfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Creates a library based upon the standalone API, without NgModules.
      */
    var standalone: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(name: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setEntryFileUndefined: Self = StObject.set(x, "entryFile", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def setSkipInstall(value: Boolean): Self = StObject.set(x, "skipInstall", value.asInstanceOf[js.Any])
      
      inline def setSkipInstallUndefined: Self = StObject.set(x, "skipInstall", js.undefined)
      
      inline def setSkipPackageJson(value: Boolean): Self = StObject.set(x, "skipPackageJson", value.asInstanceOf[js.Any])
      
      inline def setSkipPackageJsonUndefined: Self = StObject.set(x, "skipPackageJson", js.undefined)
      
      inline def setSkipTsConfig(value: Boolean): Self = StObject.set(x, "skipTsConfig", value.asInstanceOf[js.Any])
      
      inline def setSkipTsConfigUndefined: Self = StObject.set(x, "skipTsConfig", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
