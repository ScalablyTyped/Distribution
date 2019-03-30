package typings
package atStorybookRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  val Link: atStorybookRouterLib.Anon_DisplayName = js.native
  val Location: atStorybookRouterLib.Anon_DisplayNameHasChildren = js.native
  val Match: atStorybookRouterLib.Anon_DisplayNameHasChildrenPathStartsWith = js.native
  val Route: atStorybookRouterLib.Anon_DisplayNameHasPathChildrenStartsWithHideOnly = js.native
  def getMatch(current: java.lang.String, target: java.lang.String): atStorybookRouterLib.Anon_Path = js.native
  def getMatch(current: java.lang.String, target: java.lang.String, startsWith: scala.Boolean): atStorybookRouterLib.Anon_Path = js.native
  def navigate(to: java.lang.String): scala.Unit = js.native
  def queryFromLocation(location: atStorybookRouterLib.Anon_Search): js.Any = js.native
  def queryFromString(s: js.Any): js.Any = js.native
  def sanitize(string: java.lang.String): java.lang.String = js.native
  def storyDataFromString(path: java.lang.String): atStorybookRouterLib.distUtilsMod.StoryData = js.native
  def stringifyQuery(query: js.Object): js.Any = js.native
  def toId(kind: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

