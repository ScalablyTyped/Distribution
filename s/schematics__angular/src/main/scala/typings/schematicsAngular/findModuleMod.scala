package typings.schematicsAngular

import typings.angularDevkitCore.pathMod.Path_
import typings.angularDevkitSchematics.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findModuleMod {
  
  @JSImport("@schematics/angular/utility/find-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@schematics/angular/utility/find-module", "MODULE_EXT")
  @js.native
  val MODULE_EXT: /* ".module.ts" */ String = js.native
  
  @JSImport("@schematics/angular/utility/find-module", "ROUTING_MODULE_EXT")
  @js.native
  val ROUTING_MODULE_EXT: /* "-routing.module.ts" */ String = js.native
  
  inline def buildRelativePath(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRelativePath")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findModule(host: Tree, generateDir: String): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("findModule")(host.asInstanceOf[js.Any], generateDir.asInstanceOf[js.Any])).asInstanceOf[Path_]
  inline def findModule(host: Tree, generateDir: String, moduleExt: String): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("findModule")(host.asInstanceOf[js.Any], generateDir.asInstanceOf[js.Any], moduleExt.asInstanceOf[js.Any])).asInstanceOf[Path_]
  inline def findModule(host: Tree, generateDir: String, moduleExt: String, routingModuleExt: String): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("findModule")(host.asInstanceOf[js.Any], generateDir.asInstanceOf[js.Any], moduleExt.asInstanceOf[js.Any], routingModuleExt.asInstanceOf[js.Any])).asInstanceOf[Path_]
  inline def findModule(host: Tree, generateDir: String, moduleExt: Unit, routingModuleExt: String): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("findModule")(host.asInstanceOf[js.Any], generateDir.asInstanceOf[js.Any], moduleExt.asInstanceOf[js.Any], routingModuleExt.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def findModuleFromOptions(host: Tree, options: ModuleOptions): js.UndefOr[Path_] = (^.asInstanceOf[js.Dynamic].applyDynamic("findModuleFromOptions")(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Path_]]
  
  trait ModuleOptions extends StObject {
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var moduleExt: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var routingModuleExt: js.UndefOr[String] = js.undefined
    
    var skipImport: js.UndefOr[Boolean] = js.undefined
    
    var standalone: js.UndefOr[Boolean] = js.undefined
  }
  object ModuleOptions {
    
    inline def apply(name: String): ModuleOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleOptions]
    }
    
    extension [Self <: ModuleOptions](x: Self) {
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleExt(value: String): Self = StObject.set(x, "moduleExt", value.asInstanceOf[js.Any])
      
      inline def setModuleExtUndefined: Self = StObject.set(x, "moduleExt", js.undefined)
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRoutingModuleExt(value: String): Self = StObject.set(x, "routingModuleExt", value.asInstanceOf[js.Any])
      
      inline def setRoutingModuleExtUndefined: Self = StObject.set(x, "routingModuleExt", js.undefined)
      
      inline def setSkipImport(value: Boolean): Self = StObject.set(x, "skipImport", value.asInstanceOf[js.Any])
      
      inline def setSkipImportUndefined: Self = StObject.set(x, "skipImport", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
