package typings.snykCocoapodsLockfileParser

import typings.snykDepGraph.typesMod.PkgInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/cocoapods-lockfile-parser/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def pkgInfoFromDependencyString(stringRepresentation: String): PkgInfo = js.native
  def pkgInfoFromSpecificationString(stringRepresentation: String): PkgInfo = js.native
  def rootSpecName(specName: String): String = js.native
}

