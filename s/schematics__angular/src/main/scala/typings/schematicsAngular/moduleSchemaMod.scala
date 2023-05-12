package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleSchemaMod {
  
  @js.native
  sealed trait RoutingScope extends StObject
  @JSImport("@schematics/angular/module/schema", "RoutingScope")
  @js.native
  object RoutingScope extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoutingScope & String] = js.native
    
    @js.native
    sealed trait Child
      extends StObject
         with RoutingScope
    /* "Child" */ val Child: typings.schematicsAngular.moduleSchemaMod.RoutingScope.Child & String = js.native
    
    @js.native
    sealed trait Root
      extends StObject
         with RoutingScope
    /* "Root" */ val Root: typings.schematicsAngular.moduleSchemaMod.RoutingScope.Root & String = js.native
  }
  
  trait Schema extends StObject {
    
    /**
      * The new NgModule imports "CommonModule".
      */
    var commonModule: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Create the new files at the top level of the current project root.
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The declaring NgModule.
      */
    var module: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the NgModule.
      */
    var name: String
    
    /**
      * The path at which to create the NgModule, relative to the workspace root.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: String
    
    /**
      * The route path for a lazy-loaded module. When supplied, creates a component in the new
      * module, and adds the route to that component in the `Routes` array declared in the module
      * provided in the `--module` option.
      */
    var route: js.UndefOr[String] = js.undefined
    
    /**
      * Create a routing module.
      */
    var routing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The scope for the new routing module.
      */
    var routingScope: js.UndefOr[RoutingScope] = js.undefined
  }
  object Schema {
    
    inline def apply(name: String, project: String): Schema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setCommonModule(value: Boolean): Self = StObject.set(x, "commonModule", value.asInstanceOf[js.Any])
      
      inline def setCommonModuleUndefined: Self = StObject.set(x, "commonModule", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setRouting(value: Boolean): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      inline def setRoutingScope(value: RoutingScope): Self = StObject.set(x, "routingScope", value.asInstanceOf[js.Any])
      
      inline def setRoutingScopeUndefined: Self = StObject.set(x, "routingScope", js.undefined)
      
      inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    }
  }
}
