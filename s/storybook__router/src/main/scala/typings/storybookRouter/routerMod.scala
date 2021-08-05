package typings.storybookRouter

import typings.history.mod.LocationState
import typings.reachRouter.mod.LocationProviderProps
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.storybookRouter.anon.Path
import typings.storybookRouter.anon.ReadonlyLocationProviderP
import typings.storybookRouter.utilsMod.StoryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  object Link {
    
    inline def apply(hasToChildrenRest: QueryLinkProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasToChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router/dist/router", "Link")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Link.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Location {
    
    inline def apply(hasChildren: QueryLocationProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router/dist/router", "Location")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Location.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router/dist/router", "LocationProvider")
  @js.native
  class LocationProvider protected ()
    extends typings.reachRouter.mod.LocationProvider {
    def this(props: LocationProviderProps) = this()
    def this(props: ReadonlyLocationProviderP) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocationProviderProps, context: js.Any) = this()
  }
  
  object Match {
    
    inline def apply(hasChildrenTargetPathStartsWith: QueryMatchProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenTargetPathStartsWith.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router/dist/router", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Match.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Route {
    
    inline def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasPathChildrenStartsWithHideOnly.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router/dist/router", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Route.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router/dist/router", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  trait MatchingData extends StObject {
    
    var `match`: Null | Path
  }
  object MatchingData {
    
    inline def apply(): MatchingData = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(null)
      __obj.asInstanceOf[MatchingData]
    }
    
    extension [Self <: MatchingData](x: Self) {
      
      inline def setMatch(value: Path): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchNull: Self = StObject.set(x, "match", null)
    }
  }
  
  trait Other
    extends StObject
       with StoryData {
    
    var path: String
  }
  object Other {
    
    inline def apply(path: String): Other = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Other]
    }
    
    extension [Self <: Other](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryLinkProps extends StObject {
    
    var children: ReactNode
    
    var to: String
  }
  object QueryLinkProps {
    
    inline def apply(to: String): QueryLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryLinkProps]
    }
    
    extension [Self <: QueryLinkProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryLocationProps extends StObject {
    
    def children(renderData: RenderData): ReactNode
  }
  object QueryLocationProps {
    
    inline def apply(children: RenderData => ReactNode): QueryLocationProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[QueryLocationProps]
    }
    
    extension [Self <: QueryLocationProps](x: Self) {
      
      inline def setChildren(value: RenderData => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait QueryMatchProps extends StObject {
    
    def children(matchingData: MatchingData): ReactNode
    
    var path: String
    
    var startsWith: Boolean
  }
  object QueryMatchProps {
    
    inline def apply(children: MatchingData => ReactNode, path: String, startsWith: Boolean): QueryMatchProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryMatchProps]
    }
    
    extension [Self <: QueryMatchProps](x: Self) {
      
      inline def setChildren(value: MatchingData => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@reach/router.@reach/router.LocationContext, 'location'> & std.Partial<std.Pick<@reach/router.@reach/router.LocationContext, 'navigate'>> & @storybook/router.@storybook/router/dist/router.Other */
  trait RenderData extends StObject {
    
    var location: WindowLocation[LocationState]
    
    var navigate: js.UndefOr[NavigateFn] = js.undefined
    
    var path: String
    
    var refId: js.UndefOr[String] = js.undefined
    
    var storyId: js.UndefOr[String] = js.undefined
    
    var viewMode: js.UndefOr[String] = js.undefined
  }
  object RenderData {
    
    inline def apply(location: WindowLocation[LocationState], path: String): RenderData = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderData]
    }
    
    extension [Self <: RenderData](x: Self) {
      
      inline def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  trait RouteProps extends StObject {
    
    var children: ReactNode
    
    var hideOnly: js.UndefOr[Boolean] = js.undefined
    
    var path: String
    
    var startsWith: js.UndefOr[Boolean] = js.undefined
  }
  object RouteProps {
    
    inline def apply(path: String): RouteProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProps]
    }
    
    extension [Self <: RouteProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHideOnly(value: Boolean): Self = StObject.set(x, "hideOnly", value.asInstanceOf[js.Any])
      
      inline def setHideOnlyUndefined: Self = StObject.set(x, "hideOnly", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    }
  }
}
