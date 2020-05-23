package typings.snykNodejsLockfileParser.packageLockParserMod

import typings.snykNodejsLockfileParser.parsersMod.Lockfile
import typings.snykNodejsLockfileParser.parsersMod.LockfileType.npm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageLock extends Lockfile {
  var dependencies: js.UndefOr[PackageLockDeps] = js.undefined
  var lockfileVersion: Double
  var name: String
  var `type`: npm
  var version: String
}

object PackageLock {
  @scala.inline
  def apply(
    lockfileVersion: Double,
    name: String,
    `type`: npm,
    version: String,
    dependencies: PackageLockDeps = null
  ): PackageLock = {
    val __obj = js.Dynamic.literal(lockfileVersion = lockfileVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageLock]
  }
}

