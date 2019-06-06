package typings
package atStorybookRouterLib.distUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router/dist/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val knownNonViewModesRegex: stdLib.RegExp = js.native
  def getMatch(current: java.lang.String, target: java.lang.String): atStorybookRouterLib.Anon_Path = js.native
  def getMatch(current: java.lang.String, target: java.lang.String, startsWith: scala.Boolean): atStorybookRouterLib.Anon_Path = js.native
  def parseKind(kind: java.lang.String, hasRootSeparatorGroupSeparator: SeparatorOptions): atStorybookRouterLib.Anon_Groups = js.native
  def parsePath(): StoryData = js.native
  def parsePath(path: java.lang.String): StoryData = js.native
  def queryFromLocation(location: atStorybookRouterLib.Anon_Search): Query = js.native
  def queryFromString(s: java.lang.String): Query = js.native
  def sanitize(string: java.lang.String): java.lang.String = js.native
  def stringifyQuery(query: Query): js.Any = js.native
  def toId(kind: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

