package typings
package atStorybookRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  def getMatch(current: java.lang.String, target: java.lang.String): atStorybookRouterLib.Anon_Path = js.native
  def getMatch(current: java.lang.String, target: java.lang.String, startsWith: scala.Boolean): atStorybookRouterLib.Anon_Path = js.native
  def navigate(to: java.lang.String): scala.Unit = js.native
  def queryFromLocation(location: atStorybookRouterLib.Anon_Search): js.Any = js.native
  def queryFromString(s: js.Any): js.Any = js.native
  def sanitize(string: java.lang.String): java.lang.String = js.native
  def storyDataFromString(path: java.lang.String): atStorybookRouterLib.distUtilsMod.StoryData = js.native
  def stringifyQuery(query: js.Object): js.Any = js.native
  def toId(kind: java.lang.String, name: java.lang.String): java.lang.String = js.native
  @js.native
  object Link extends js.Object {
    var displayName: java.lang.String = js.native
    def apply(hasToChildrenRest: atStorybookRouterLib.distRouterMod.QueryLinkProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  }
  
  @js.native
  object Location extends js.Object {
    var displayName: java.lang.String = js.native
    def apply(hasChildren: atStorybookRouterLib.distRouterMod.QueryLocationProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  }
  
  @js.native
  object Match extends js.Object {
    var displayName: java.lang.String = js.native
    def apply(hasChildrenPathStartsWith: atStorybookRouterLib.distRouterMod.QueryMatchProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  }
  
  @js.native
  object Route extends js.Object {
    var displayName: java.lang.String = js.native
    def apply(hasPathChildrenStartsWithHideOnly: atStorybookRouterLib.distRouterMod.RouteProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  }
  
}

