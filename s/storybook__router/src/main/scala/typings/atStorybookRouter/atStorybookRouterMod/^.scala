package typings.atStorybookRouter.atStorybookRouterMod

import typings.atStorybookRouter.Anon_Groups
import typings.atStorybookRouter.Anon_Path
import typings.atStorybookRouter.Anon_Search
import typings.atStorybookRouter.distUtilsMod.Query
import typings.atStorybookRouter.distUtilsMod.SeparatorOptions
import typings.atStorybookRouter.distUtilsMod.StoryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getMatch(current: String, target: String): Anon_Path = js.native
  def getMatch(current: String, target: String, startsWith: Boolean): Anon_Path = js.native
  def navigate(to: String): Unit = js.native
  def parseKind(kind: String, hasRootSeparatorGroupSeparator: SeparatorOptions): Anon_Groups = js.native
  def parsePath(): StoryData = js.native
  def parsePath(path: String): StoryData = js.native
  def queryFromLocation(location: Anon_Search): Query = js.native
  def queryFromString(s: String): Query = js.native
  def sanitize(string: String): String = js.native
  def storyNameFromExport(key: String): String = js.native
  def stringifyQuery(query: Query): js.Any = js.native
  def toId(kind: String, name: String): String = js.native
}

