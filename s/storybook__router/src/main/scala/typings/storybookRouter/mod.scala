package typings.storybookRouter

import typings.reachRouter.mod.LocationProviderProps
import typings.reachRouter.mod.NavigateFn
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.storybookRouter.anon.Search
import typings.storybookRouter.routerMod.QueryLinkProps
import typings.storybookRouter.routerMod.QueryLocationProps
import typings.storybookRouter.routerMod.QueryMatchProps
import typings.storybookRouter.routerMod.RouteProps
import typings.storybookRouter.utilsMod.Match
import typings.storybookRouter.utilsMod.Query
import typings.storybookRouter.utilsMod.StoryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getMatch(current: String, target: String): Match | Null = js.native
  def getMatch(current: String, target: String, startsWith: js.Any): Match | Null = js.native
  
  val navigate: NavigateFn = js.native
  
  def parsePath(): StoryData = js.native
  def parsePath(path: String): StoryData = js.native
  
  def queryFromLocation(location: Search): Query = js.native
  
  def queryFromString(s: String): Query = js.native
  
  def stringifyQuery(query: Query): js.Any = js.native
  
  @js.native
  object Link extends js.Object {
    
    def apply(hasToChildrenRest: QueryLinkProps): Element = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  object Location extends js.Object {
    
    def apply(hasChildren: QueryLocationProps): Element = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  class LocationProvider ()
    extends Component[LocationProviderProps, js.Object, js.Any]
  
  @js.native
  object Match extends js.Object {
    
    def apply(hasChildrenPathStartsWith: QueryMatchProps): Element = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  object Route extends js.Object {
    
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = js.native
    
    var displayName: String = js.native
  }
}
