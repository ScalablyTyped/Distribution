package typings.snykNodejsLockfileParser.parsersMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykNodejsLockfileParser.packageLockParserMod.PackageLockDeps
import typings.snykNodejsLockfileParser.parsersMod.LockfileType.npm
import typings.snykNodejsLockfileParser.parsersMod.LockfileType.yarn
import typings.snykNodejsLockfileParser.yarnLockParseMod.YarnLockDep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.snykNodejsLockfileParser.packageLockParserMod.PackageLock
  - typings.snykNodejsLockfileParser.yarnLockParseMod.YarnLock
*/
trait Lockfile extends js.Object

object Lockfile {
  @scala.inline
  def PackageLock(
    lockfileVersion: Double,
    name: String,
    `type`: npm,
    version: String,
    dependencies: PackageLockDeps = null
  ): Lockfile = {
    val __obj = js.Dynamic.literal(lockfileVersion = lockfileVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockfile]
  }
  @scala.inline
  def YarnLock(
    lockfileType: yarn,
    `object`: StringDictionary[YarnLockDep],
    `type`: String,
    dependencies: StringDictionary[YarnLockDep] = null
  ): Lockfile = {
    val __obj = js.Dynamic.literal(lockfileType = lockfileType.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockfile]
  }
}

