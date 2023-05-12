package typings.schematicsAngular

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityAddDeclarationToNgModuleMod {
  
  @JSImport("@schematics/angular/utility/add-declaration-to-ng-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDeclarationToNgModule(options: DeclarationToNgModuleOptions): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("addDeclarationToNgModule")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  trait DeclarationToNgModuleOptions extends StObject {
    
    var `export`: js.UndefOr[Boolean] = js.undefined
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var skipImport: js.UndefOr[Boolean] = js.undefined
    
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
  }
  object DeclarationToNgModuleOptions {
    
    inline def apply(name: String, `type`: String): DeclarationToNgModuleOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationToNgModuleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeclarationToNgModuleOptions] (val x: Self) extends AnyVal {
      
      inline def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSkipImport(value: Boolean): Self = StObject.set(x, "skipImport", value.asInstanceOf[js.Any])
      
      inline def setSkipImportUndefined: Self = StObject.set(x, "skipImport", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
