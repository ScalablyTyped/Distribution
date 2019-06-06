package typings
package atStorybookRouterLib.atStorybookRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val knownNonViewModesRegex: stdLib.RegExp = js.native
  def getMatch(current: java.lang.String, target: java.lang.String): atStorybookRouterLib.Anon_Path = js.native
  def getMatch(current: java.lang.String, target: java.lang.String, startsWith: scala.Boolean): atStorybookRouterLib.Anon_Path = js.native
  def navigate(to: java.lang.String): scala.Unit = js.native
  def parseKind(
    kind: java.lang.String,
    hasRootSeparatorGroupSeparator: atStorybookRouterLib.distUtilsMod.SeparatorOptions
  ): atStorybookRouterLib.Anon_Groups = js.native
  def parsePath(): atStorybookRouterLib.distUtilsMod.StoryData = js.native
  def parsePath(path: java.lang.String): atStorybookRouterLib.distUtilsMod.StoryData = js.native
  def queryFromLocation(location: atStorybookRouterLib.Anon_Search): atStorybookRouterLib.distUtilsMod.Query = js.native
  def queryFromString(s: java.lang.String): atStorybookRouterLib.distUtilsMod.Query = js.native
  def sanitize(string: java.lang.String): java.lang.String = js.native
  def stringifyQuery(query: atStorybookRouterLib.distUtilsMod.Query): js.Any = js.native
  def toId(kind: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

