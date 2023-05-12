package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationSchemaMod {
  
  @js.native
  sealed trait Style extends StObject
  @JSImport("@schematics/angular/application/schema", "Style")
  @js.native
  object Style extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Style & String] = js.native
    
    @js.native
    sealed trait Css
      extends StObject
         with Style
    /* "css" */ val Css: typings.schematicsAngular.applicationSchemaMod.Style.Css & String = js.native
    
    @js.native
    sealed trait Less
      extends StObject
         with Style
    /* "less" */ val Less: typings.schematicsAngular.applicationSchemaMod.Style.Less & String = js.native
    
    @js.native
    sealed trait Sass
      extends StObject
         with Style
    /* "sass" */ val Sass: typings.schematicsAngular.applicationSchemaMod.Style.Sass & String = js.native
    
    @js.native
    sealed trait Scss
      extends StObject
         with Style
    /* "scss" */ val Scss: typings.schematicsAngular.applicationSchemaMod.Style.Scss & String = js.native
  }
  
  @js.native
  sealed trait ViewEncapsulation extends StObject
  @JSImport("@schematics/angular/application/schema", "ViewEncapsulation")
  @js.native
  object ViewEncapsulation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ViewEncapsulation & String] = js.native
    
    @js.native
    sealed trait Emulated
      extends StObject
         with ViewEncapsulation
    /* "Emulated" */ val Emulated: typings.schematicsAngular.applicationSchemaMod.ViewEncapsulation.Emulated & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with ViewEncapsulation
    /* "None" */ val None: typings.schematicsAngular.applicationSchemaMod.ViewEncapsulation.None & String = js.native
    
    @js.native
    sealed trait ShadowDom
      extends StObject
         with ViewEncapsulation
    /* "ShadowDom" */ val ShadowDom: typings.schematicsAngular.applicationSchemaMod.ViewEncapsulation.ShadowDom & String = js.native
  }
  
  trait Schema extends StObject {
    
    /**
      * Include styles inline in the root component.ts file. Only CSS styles can be included
      * inline. Default is false, meaning that an external styles file is created and referenced
      * in the root component.ts file.
      */
    var inlineStyle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include template inline in the root component.ts file. Default is false, meaning that an
      * external template file is created and referenced in the root component.ts file.
      */
    var inlineTemplate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Create a bare-bones project without any testing frameworks. (Use for learning purposes
      * only.)
      */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the new application.
      */
    var name: String
    
    /**
      * A prefix to apply to generated selectors.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The root directory of the new application.
      */
    var projectRoot: js.UndefOr[String] = js.undefined
    
    /**
      * Create a routing NgModule.
      */
    var routing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skip installing dependency packages.
      */
    var skipInstall: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not add dependencies to the "package.json" file.
      */
    var skipPackageJson: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not create "spec.ts" test files for the application.
      */
    var skipTests: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Creates an application based upon the standalone API, without NgModules.
      */
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Creates an application with stricter bundle budgets settings.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file extension or preprocessor to use for style files.
      */
    var style: js.UndefOr[Style] = js.undefined
    
    /**
      * The view encapsulation strategy to use in the new application.
      */
    var viewEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  }
  object Schema {
    
    inline def apply(name: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setInlineStyle(value: Boolean): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleUndefined: Self = StObject.set(x, "inlineStyle", js.undefined)
      
      inline def setInlineTemplate(value: Boolean): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
      
      inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def setRouting(value: Boolean): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
      
      inline def setSkipInstall(value: Boolean): Self = StObject.set(x, "skipInstall", value.asInstanceOf[js.Any])
      
      inline def setSkipInstallUndefined: Self = StObject.set(x, "skipInstall", js.undefined)
      
      inline def setSkipPackageJson(value: Boolean): Self = StObject.set(x, "skipPackageJson", value.asInstanceOf[js.Any])
      
      inline def setSkipPackageJsonUndefined: Self = StObject.set(x, "skipPackageJson", js.undefined)
      
      inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
      
      inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setViewEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "viewEncapsulation", value.asInstanceOf[js.Any])
      
      inline def setViewEncapsulationUndefined: Self = StObject.set(x, "viewEncapsulation", js.undefined)
    }
  }
}
