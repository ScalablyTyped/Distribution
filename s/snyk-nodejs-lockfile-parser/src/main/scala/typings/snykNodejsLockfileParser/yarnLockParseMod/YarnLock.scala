package typings.snykNodejsLockfileParser.yarnLockParseMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykNodejsLockfileParser.parsersMod.Lockfile
import typings.snykNodejsLockfileParser.parsersMod.LockfileType.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarnLock extends Lockfile {
  var dependencies: js.UndefOr[StringDictionary[YarnLockDep]] = js.undefined
  var lockfileType: yarn
  var `object`: StringDictionary[YarnLockDep]
  var `type`: String
}

object YarnLock {
  @scala.inline
  def apply(
    lockfileType: yarn,
    `object`: StringDictionary[YarnLockDep],
    `type`: String,
    dependencies: StringDictionary[YarnLockDep] = null
  ): YarnLock = {
    val __obj = js.Dynamic.literal(lockfileType = lockfileType.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[YarnLock]
  }
}

