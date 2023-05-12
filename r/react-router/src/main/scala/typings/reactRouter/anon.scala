package typings.reactRouter

import typings.reactRouter.distLibContextMod.DataRouteObject
import typings.remixRunRouter.distHistoryMod.InitialEntry
import typings.remixRunRouter.distRouterMod.HydrationState
import typings.remixRunRouter.distRouterMod.RelativeRoutingType
import typings.remixRunRouter.distRouterMod.RevalidationState
import typings.remixRunRouter.distUtilsMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basename extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var future: js.UndefOr[PartialOmitFutureConfigv7] = js.undefined
    
    var hydrationData: js.UndefOr[HydrationState] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[InitialEntry]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
  }
  object Basename {
    
    inline def apply(): Basename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Basename] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setFuture(value: PartialOmitFutureConfigv7): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      inline def setHydrationData(value: HydrationState): Self = StObject.set(x, "hydrationData", value.asInstanceOf[js.Any])
      
      inline def setHydrationDataUndefined: Self = StObject.set(x, "hydrationData", js.undefined)
      
      inline def setInitialEntries(value: js.Array[InitialEntry]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: InitialEntry*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasErrorBoundary extends StObject {
    
    var hasErrorBoundary: Boolean
  }
  object HasErrorBoundary {
    
    inline def apply(hasErrorBoundary: Boolean): HasErrorBoundary = {
      val __obj = js.Dynamic.literal(hasErrorBoundary = hasErrorBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasErrorBoundary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasErrorBoundary] (val x: Self) extends AnyVal {
      
      inline def setHasErrorBoundary(value: Boolean): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var error: Any
    
    var location: typings.remixRunRouter.distHistoryMod.Location
    
    var revalidation: RevalidationState
  }
  object Location {
    
    inline def apply(
      error: Any,
      location: typings.remixRunRouter.distHistoryMod.Location,
      revalidation: RevalidationState
    ): Location = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], revalidation = revalidation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setRevalidation(value: RevalidationState): Self = StObject.set(x, "revalidation", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLocation] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Partial<std.Omit<@remix-run/router.@remix-run/router.FutureConfig, 'v7_prependBasename'>> */
  trait PartialOmitFutureConfigv7 extends StObject {
    
    var v7_normalizeFormMethod: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOmitFutureConfigv7 {
    
    inline def apply(): PartialOmitFutureConfigv7 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitFutureConfigv7]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOmitFutureConfigv7] (val x: Self) extends AnyVal {
      
      inline def setV7_normalizeFormMethod(value: Boolean): Self = StObject.set(x, "v7_normalizeFormMethod", value.asInstanceOf[js.Any])
      
      inline def setV7_normalizeFormMethodUndefined: Self = StObject.set(x, "v7_normalizeFormMethod", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Relative] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Revalidate] (val x: Self) extends AnyVal {
      
      inline def setRevalidate(value: () => Unit): Self = StObject.set(x, "revalidate", js.Any.fromFunction0(value))
      
      inline def setState(value: RevalidationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
