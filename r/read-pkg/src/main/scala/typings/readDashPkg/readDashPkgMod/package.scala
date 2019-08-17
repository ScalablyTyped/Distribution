package typings.readDashPkg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readDashPkgMod {
  import typings.normalizeDashPackageDashData.normalizeDashPackageDashDataMod.Package

  type NormalizedPackageJson = PackageJson with Package
  type PackageJson = typings.typeDashFest.sourcePackageDashJsonMod.PackageJson
}
