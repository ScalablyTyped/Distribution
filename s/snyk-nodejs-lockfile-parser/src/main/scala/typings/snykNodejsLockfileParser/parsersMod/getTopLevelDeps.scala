package typings.snykNodejsLockfileParser.parsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-nodejs-lockfile-parser/dist/parsers", "getTopLevelDeps")
@js.native
object getTopLevelDeps extends js.Object {
  def apply(targetFile: ManifestFile, includeDev: Boolean): js.Array[Dep] = js.native
}

