package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directiveSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The declaring NgModule exports this directive.
      */
    var `export`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true (the default), creates the new files at the top level of the current project.
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The declaring NgModule.
      */
    var module: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the new directive.
      */
    var name: String
    
    /**
      * The path at which to create the interface that defines the directive, relative to the
      * workspace root.
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
      * The HTML selector to use for this directive.
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /**
      * Do not import this directive into the owning NgModule.
      */
    var skipImport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not create "spec.ts" test files for the new class.
      */
    var skipTests: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the generated directive is standalone.
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
      
      inline def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSkipImport(value: Boolean): Self = StObject.set(x, "skipImport", value.asInstanceOf[js.Any])
      
      inline def setSkipImportUndefined: Self = StObject.set(x, "skipImport", js.undefined)
      
      inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
      
      inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
