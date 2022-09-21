package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentSchemaMod {
  
  @js.native
  sealed trait ChangeDetection extends StObject
  @JSImport("@schematics/angular/component/schema", "ChangeDetection")
  @js.native
  object ChangeDetection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChangeDetection & String] = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with ChangeDetection
    /* "Default" */ val Default: typings.schematicsAngular.componentSchemaMod.ChangeDetection.Default & String = js.native
    
    @js.native
    sealed trait OnPush
      extends StObject
         with ChangeDetection
    /* "OnPush" */ val OnPush: typings.schematicsAngular.componentSchemaMod.ChangeDetection.OnPush & String = js.native
  }
  
  @js.native
  sealed trait Style extends StObject
  @JSImport("@schematics/angular/component/schema", "Style")
  @js.native
  object Style extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Style & String] = js.native
    
    @js.native
    sealed trait Css
      extends StObject
         with Style
    /* "css" */ val Css: typings.schematicsAngular.componentSchemaMod.Style.Css & String = js.native
    
    @js.native
    sealed trait Less
      extends StObject
         with Style
    /* "less" */ val Less: typings.schematicsAngular.componentSchemaMod.Style.Less & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with Style
    /* "none" */ val None: typings.schematicsAngular.componentSchemaMod.Style.None & String = js.native
    
    @js.native
    sealed trait Sass
      extends StObject
         with Style
    /* "sass" */ val Sass: typings.schematicsAngular.componentSchemaMod.Style.Sass & String = js.native
    
    @js.native
    sealed trait Scss
      extends StObject
         with Style
    /* "scss" */ val Scss: typings.schematicsAngular.componentSchemaMod.Style.Scss & String = js.native
  }
  
  @js.native
  sealed trait ViewEncapsulation extends StObject
  @JSImport("@schematics/angular/component/schema", "ViewEncapsulation")
  @js.native
  object ViewEncapsulation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ViewEncapsulation & String] = js.native
    
    @js.native
    sealed trait Emulated
      extends StObject
         with ViewEncapsulation
    /* "Emulated" */ val Emulated: typings.schematicsAngular.componentSchemaMod.ViewEncapsulation.Emulated & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with ViewEncapsulation
    /* "None" */ val None: typings.schematicsAngular.componentSchemaMod.ViewEncapsulation.None & String = js.native
    
    @js.native
    sealed trait ShadowDom
      extends StObject
         with ViewEncapsulation
    /* "ShadowDom" */ val ShadowDom: typings.schematicsAngular.componentSchemaMod.ViewEncapsulation.ShadowDom & String = js.native
  }
  
  trait Schema extends StObject {
    
    /**
      * The change detection strategy to use in the new component.
      */
    var changeDetection: js.UndefOr[ChangeDetection] = js.undefined
    
    /**
      * Specifies if the style will contain `:host { display: block; }`.
      */
    var displayBlock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The declaring NgModule exports this component.
      */
    var `export`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Create the new files at the top level of the current project.
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include styles inline in the component.ts file. Only CSS styles can be included inline.
      * By default, an external styles file is created and referenced in the component.ts file.
      */
    var inlineStyle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include template inline in the component.ts file. By default, an external template file
      * is created and referenced in the component.ts file.
      */
    var inlineTemplate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The declaring NgModule.
      */
    var module: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the component.
      */
    var name: String
    
    /**
      * The path at which to create the component file, relative to the current workspace.
      * Default is a folder with the same name as the component in the project root.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The prefix to apply to the generated component selector.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * The HTML selector to use for this component.
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /**
      * Do not import this component into the owning NgModule.
      */
    var skipImport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies if the component should have a selector or not.
      */
    var skipSelector: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not create "spec.ts" test files for the new component.
      */
    var skipTests: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the generated component is standalone.
      */
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file extension or preprocessor to use for style files, or 'none' to skip generating
      * the style file.
      */
    var style: js.UndefOr[Style] = js.undefined
    
    /**
      * Adds a developer-defined type to the filename, in the format "name.type.ts".
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * The view encapsulation strategy to use in the new component.
      */
    var viewEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  }
  object Schema {
    
    inline def apply(name: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setChangeDetection(value: ChangeDetection): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
      
      inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
      
      inline def setDisplayBlock(value: Boolean): Self = StObject.set(x, "displayBlock", value.asInstanceOf[js.Any])
      
      inline def setDisplayBlockUndefined: Self = StObject.set(x, "displayBlock", js.undefined)
      
      inline def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setInlineStyle(value: Boolean): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleUndefined: Self = StObject.set(x, "inlineStyle", js.undefined)
      
      inline def setInlineTemplate(value: Boolean): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
      
      inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
      
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
      
      inline def setSkipSelector(value: Boolean): Self = StObject.set(x, "skipSelector", value.asInstanceOf[js.Any])
      
      inline def setSkipSelectorUndefined: Self = StObject.set(x, "skipSelector", js.undefined)
      
      inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
      
      inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setViewEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "viewEncapsulation", value.asInstanceOf[js.Any])
      
      inline def setViewEncapsulationUndefined: Self = StObject.set(x, "viewEncapsulation", js.undefined)
    }
  }
}
