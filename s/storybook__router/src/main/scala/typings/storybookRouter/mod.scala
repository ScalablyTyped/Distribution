package typings.storybookRouter

import typings.reachRouter.mod.LocationProviderProps
import typings.reachRouter.mod.NavigateFn
import typings.react.mod.global.JSX.Element
import typings.storybookRouter.anon.ReadonlyLocationProviderP
import typings.storybookRouter.anon.Search
import typings.storybookRouter.routerMod.QueryLinkProps
import typings.storybookRouter.routerMod.QueryLocationProps
import typings.storybookRouter.routerMod.QueryMatchProps
import typings.storybookRouter.routerMod.RouteProps
import typings.storybookRouter.utilsMod.Match
import typings.storybookRouter.utilsMod.Query
import typings.storybookRouter.utilsMod.StoryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Link {
    
    inline def apply(hasToChildrenRest: QueryLinkProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasToChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router", "Link")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Link.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Location {
    
    inline def apply(hasChildren: QueryLocationProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router", "Location")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Location.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router", "LocationProvider")
  @js.native
  class LocationProvider protected ()
    extends typings.storybookRouter.routerMod.LocationProvider {
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
    
    @JSImport("@storybook/router", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Match.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Route {
    
    inline def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasPathChildrenStartsWithHideOnly.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Route.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def getMatch(current: String, target: String): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  inline def getMatch(current: String, target: String, startsWith: js.Any): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], startsWith.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  
  @JSImport("@storybook/router", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  inline def parsePath(): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[StoryData]
  inline def parsePath(path: String): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[StoryData]
  
  inline def queryFromLocation(location: Search): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromLocation")(location.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def queryFromString(s: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")(s.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def stringifyQuery(query: Query): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
