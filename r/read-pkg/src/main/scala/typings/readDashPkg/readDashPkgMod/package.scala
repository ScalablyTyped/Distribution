package typings.readDashPkg

import typings.normalizeDashPackageDashData.normalizeDashPackageDashDataMod.Package
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readDashPkgMod {
  type NormalizedPackageJson = PackageJson with Package
  type PackageJson = typings.typeDashFest.sourcePackageDashJsonMod.PackageJson
}
