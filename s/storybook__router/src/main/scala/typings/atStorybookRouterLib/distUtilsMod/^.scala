package typings
package atStorybookRouterLib.distUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router/dist/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getMatch(current: java.lang.String, target: java.lang.String): atStorybookRouterLib.Anon_Path = js.native
  def getMatch(current: java.lang.String, target: java.lang.String, startsWith: scala.Boolean): atStorybookRouterLib.Anon_Path = js.native
  def queryFromLocation(location: atStorybookRouterLib.Anon_Search): js.Any = js.native
  def queryFromString(s: js.Any): js.Any = js.native
  def sanitize(string: java.lang.String): java.lang.String = js.native
  def storyDataFromString(path: java.lang.String): StoryData = js.native
  def stringifyQuery(query: js.Object): js.Any = js.native
  def toId(kind: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

