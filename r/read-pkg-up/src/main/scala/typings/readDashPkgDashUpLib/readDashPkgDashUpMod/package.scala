package typings
package readDashPkgDashUpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readDashPkgDashUpMod {
  type NormalizeOptions = readDashPkgDashUpLib.Anon_Cwd with (typeDashFestLib.typeDashFestMod.Omit[
    readDashPkgLib.readDashPkgMod.NormalizeOptions, 
    readDashPkgDashUpLib.readDashPkgDashUpLibStrings.cwd
  ])
  type NormalizedPackageJson = readDashPkgLib.readDashPkgMod.NormalizedPackageJson
  type Options = readDashPkgDashUpLib.Anon_Cwd with (typeDashFestLib.typeDashFestMod.Omit[
    readDashPkgLib.readDashPkgMod.Options, 
    readDashPkgDashUpLib.readDashPkgDashUpLibStrings.cwd
  ])
  type PackageJson = readDashPkgLib.readDashPkgMod.PackageJson
}
