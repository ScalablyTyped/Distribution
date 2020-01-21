package typings.storybookRouter

import typings.reachRouter.mod.LocationProviderProps
import typings.reachRouter.mod.NavigateFn
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.storybookRouter.routerMod.QueryLinkProps
import typings.storybookRouter.routerMod.QueryLocationProps
import typings.storybookRouter.routerMod.QueryMatchProps
import typings.storybookRouter.routerMod.RouteProps
import typings.storybookRouter.utilsMod.Query
import typings.storybookRouter.utilsMod.StoryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LocationProvider ()
    extends Component[LocationProviderProps, js.Object, js.Any]
  
  val navigate: NavigateFn = js.native
  def getMatch(current: String, target: String): AnonPath = js.native
  def getMatch(current: String, target: String, startsWith: js.Any): AnonPath = js.native
  def parsePath(): StoryData = js.native
  def parsePath(path: String): StoryData = js.native
  def queryFromLocation(location: AnonSearch): Query = js.native
  def queryFromString(s: String): Query = js.native
  def stringifyQuery(query: Query): js.Any = js.native
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(parseKind, sanitize, storyNameFromExport) */ def toId(kind: String, name: String): String = js.native
  @js.native
  object Link extends js.Object {
    var displayName: String = js.native
    def apply(hasToChildrenRest: QueryLinkProps): Element = js.native
  }
  
  @js.native
  object Location extends js.Object {
    var displayName: String = js.native
    def apply(hasChildren: QueryLocationProps): Element = js.native
  }
  
  @js.native
  object Match extends js.Object {
    var displayName: String = js.native
    def apply(hasChildrenPathStartsWith: QueryMatchProps): Element = js.native
  }
  
  @js.native
  object Route extends js.Object {
    var displayName: String = js.native
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = js.native
  }
  
}

