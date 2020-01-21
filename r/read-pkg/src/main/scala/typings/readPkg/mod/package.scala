package typings.readPkg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NormalizedPackageJson = typings.readPkg.mod.PackageJson with typings.normalizePackageData.mod.Package
  type PackageJson = typings.typeFest.packageJsonMod.PackageJson
}
