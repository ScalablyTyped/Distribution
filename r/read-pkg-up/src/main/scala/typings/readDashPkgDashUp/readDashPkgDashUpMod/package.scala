package typings.readDashPkgDashUp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readDashPkgDashUpMod {
  import typings.readDashPkgDashUp.Anon_Cwd
  import typings.readDashPkgDashUp.readDashPkgDashUpStrings.cwd
  import typings.typeDashFest.typeDashFestMod.Omit

  type NormalizeOptions = Anon_Cwd with (Omit[typings.readDashPkg.readDashPkgMod.NormalizeOptions, cwd])
  type NormalizedPackageJson = typings.readDashPkg.readDashPkgMod.NormalizedPackageJson
  type Options = Anon_Cwd with (Omit[typings.readDashPkg.readDashPkgMod.Options, cwd])
  type PackageJson = typings.readDashPkg.readDashPkgMod.PackageJson
}
