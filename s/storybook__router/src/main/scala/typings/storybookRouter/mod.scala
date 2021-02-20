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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Link {
    
    @JSImport("@storybook/router", "Link")
    @js.native
    def apply(hasToChildrenRest: QueryLinkProps): Element = js.native
    @JSImport("@storybook/router", "Link")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Link.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Location {
    
    @JSImport("@storybook/router", "Location")
    @js.native
    def apply(hasChildren: QueryLocationProps): Element = js.native
    @JSImport("@storybook/router", "Location")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Location.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
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
    
    @JSImport("@storybook/router", "Match")
    @js.native
    def apply(hasChildrenPathStartsWith: QueryMatchProps): Element = js.native
    @JSImport("@storybook/router", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Match.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Route {
    
    @JSImport("@storybook/router", "Route")
    @js.native
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = js.native
    @JSImport("@storybook/router", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Route.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router", "getMatch")
  @js.native
  def getMatch(current: String, target: String): Match | Null = js.native
  @JSImport("@storybook/router", "getMatch")
  @js.native
  def getMatch(current: String, target: String, startsWith: js.Any): Match | Null = js.native
  
  @JSImport("@storybook/router", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  @JSImport("@storybook/router", "parsePath")
  @js.native
  def parsePath(): StoryData = js.native
  @JSImport("@storybook/router", "parsePath")
  @js.native
  def parsePath(path: String): StoryData = js.native
  
  @JSImport("@storybook/router", "queryFromLocation")
  @js.native
  def queryFromLocation(location: Search): Query = js.native
  
  @JSImport("@storybook/router", "queryFromString")
  @js.native
  def queryFromString(s: String): Query = js.native
  
  @JSImport("@storybook/router", "stringifyQuery")
  @js.native
  def stringifyQuery(query: Query): js.Any = js.native
}
