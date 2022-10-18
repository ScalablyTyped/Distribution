package typings.reactRouter

import typings.reactRouter.distLibContextMod.DataRouteObject
import typings.reactRouter.distLibContextMod.RelativeRoutingType
import typings.remixRunRouter.distRouterMod.HydrationState
import typings.remixRunRouter.distRouterMod.RevalidationState
import typings.remixRunRouter.distUtilsMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basename extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var hydrationData: js.UndefOr[HydrationState] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[String]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
  }
  object Basename {
    
    inline def apply(): Basename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basename]
    }
    
    extension [Self <: Basename](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setHydrationData(value: HydrationState): Self = StObject.set(x, "hydrationData", value.asInstanceOf[js.Any])
      
      inline def setHydrationDataUndefined: Self = StObject.set(x, "hydrationData", js.undefined)
      
      inline def setInitialEntries(value: js.Array[String]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: String*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[js.Array[DataRouteObject]] = js.undefined
    
    var id: String
  }
  object Children {
    
    inline def apply(id: String): Children = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[DataRouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DataRouteObject*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: Any
    
    var handle: Any
    
    var id: String
    
    var params: Params[String]
    
    var pathname: String
  }
  object Data {
    
    inline def apply(data: Any, handle: Any, id: String, params: Params[String], pathname: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: Any
  }
  object Error {
    
    inline def apply(error: Any): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var error: Any
    
    var location: typings.remixRunRouter.distHistoryMod.Location
  }
  object Location {
    
    inline def apply(error: Any, location: typings.remixRunRouter.distHistoryMod.Location): Location = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@remix-run/router.@remix-run/router.Location> */
  trait PartialLocation extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object PartialLocation {
    
    inline def apply(): PartialLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocation]
    }
    
    extension [Self <: PartialLocation](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Relative extends StObject {
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
  }
  object Relative {
    
    inline def apply(): Relative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Relative]
    }
    
    extension [Self <: Relative](x: Self) {
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  trait Revalidate extends StObject {
    
    def revalidate(): Unit
    
    var state: RevalidationState
  }
  object Revalidate {
    
    inline def apply(revalidate: () => Unit, state: RevalidationState): Revalidate = {
      val __obj = js.Dynamic.literal(revalidate = js.Any.fromFunction0(revalidate), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Revalidate]
    }
    
    extension [Self <: Revalidate](x: Self) {
      
      inline def setRevalidate(value: () => Unit): Self = StObject.set(x, "revalidate", js.Any.fromFunction0(value))
      
      inline def setState(value: RevalidationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
