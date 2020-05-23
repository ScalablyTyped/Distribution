package typings.snykComposerLockfileParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockFilePackage extends js.Object {
  var name: String
  var require: LockFileDependencies
  var `require-dev`: js.UndefOr[LockFileDependencies] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object LockFilePackage {
  @scala.inline
  def apply(
    name: String,
    require: LockFileDependencies,
    `require-dev`: LockFileDependencies = null,
    version: String = null
  ): LockFilePackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
    if (`require-dev` != null) __obj.updateDynamic("require-dev")(`require-dev`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockFilePackage]
  }
}

