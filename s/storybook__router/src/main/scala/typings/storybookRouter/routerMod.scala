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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  object Link {
    
    @JSImport("@storybook/router/dist/router", "Link")
    @js.native
    def apply(hasToChildrenRest: QueryLinkProps): Element = js.native
    @JSImport("@storybook/router/dist/router", "Link")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Link.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Location {
    
    @JSImport("@storybook/router/dist/router", "Location")
    @js.native
    def apply(hasChildren: QueryLocationProps): Element = js.native
    @JSImport("@storybook/router/dist/router", "Location")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Location.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
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
    
    @JSImport("@storybook/router/dist/router", "Match")
    @js.native
    def apply(hasChildrenPathStartsWith: QueryMatchProps): Element = js.native
    @JSImport("@storybook/router/dist/router", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Match.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Route {
    
    @JSImport("@storybook/router/dist/router", "Route")
    @js.native
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = js.native
    @JSImport("@storybook/router/dist/router", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router/dist/router", "Route.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router/dist/router", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  @js.native
  trait MatchingData extends StObject {
    
    var `match`: Null | Path = js.native
  }
  object MatchingData {
    
    @scala.inline
    def apply(): MatchingData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchingData]
    }
    
    @scala.inline
    implicit class MatchingDataMutableBuilder[Self <: MatchingData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: Path): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchNull: Self = StObject.set(x, "match", null)
    }
  }
  
  @js.native
  trait Other extends StoryData {
    
    var path: String = js.native
  }
  object Other {
    
    @scala.inline
    def apply(path: String): Other = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Other]
    }
    
    @scala.inline
    implicit class OtherMutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryLinkProps extends StObject {
    
    var children: ReactNode = js.native
    
    var to: String = js.native
  }
  object QueryLinkProps {
    
    @scala.inline
    def apply(to: String): QueryLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryLinkProps]
    }
    
    @scala.inline
    implicit class QueryLinkPropsMutableBuilder[Self <: QueryLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryLocationProps extends StObject {
    
    def children(renderData: RenderData): ReactNode = js.native
  }
  object QueryLocationProps {
    
    @scala.inline
    def apply(children: RenderData => ReactNode): QueryLocationProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[QueryLocationProps]
    }
    
    @scala.inline
    implicit class QueryLocationPropsMutableBuilder[Self <: QueryLocationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: RenderData => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait QueryMatchProps extends StObject {
    
    def children(matchingData: MatchingData): ReactNode = js.native
    
    var path: String = js.native
    
    var startsWith: Boolean = js.native
  }
  object QueryMatchProps {
    
    @scala.inline
    def apply(children: MatchingData => ReactNode, path: String, startsWith: Boolean): QueryMatchProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryMatchProps]
    }
    
    @scala.inline
    implicit class QueryMatchPropsMutableBuilder[Self <: QueryMatchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: MatchingData => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@reach/router.@reach/router.LocationContext, 'location'> & std.Partial<std.Pick<@reach/router.@reach/router.LocationContext, 'navigate'>> & @storybook/router.@storybook/router/dist/router.Other */
  @js.native
  trait RenderData extends StObject {
    
    var location: WindowLocation[LocationState] = js.native
    
    var navigate: js.UndefOr[NavigateFn] = js.native
    
    var path: String = js.native
    
    var refId: js.UndefOr[String] = js.native
    
    var storyId: js.UndefOr[String] = js.native
    
    var viewMode: js.UndefOr[String] = js.native
  }
  object RenderData {
    
    @scala.inline
    def apply(location: WindowLocation[LocationState], path: String): RenderData = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderData]
    }
    
    @scala.inline
    implicit class RenderDataMutableBuilder[Self <: RenderData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      @scala.inline
      def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  @js.native
  trait RouteProps extends StObject {
    
    var children: ReactNode = js.native
    
    var hideOnly: js.UndefOr[Boolean] = js.native
    
    var path: String = js.native
    
    var startsWith: js.UndefOr[Boolean] = js.native
  }
  object RouteProps {
    
    @scala.inline
    def apply(path: String): RouteProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProps]
    }
    
    @scala.inline
    implicit class RoutePropsMutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHideOnly(value: Boolean): Self = StObject.set(x, "hideOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnlyUndefined: Self = StObject.set(x, "hideOnly", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    }
  }
}
