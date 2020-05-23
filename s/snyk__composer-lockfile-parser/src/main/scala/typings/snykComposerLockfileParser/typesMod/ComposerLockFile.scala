package typings.snykComposerLockfileParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposerLockFile extends js.Object {
  var packages: js.Array[LockFilePackage]
  var `packages-dev`: js.UndefOr[js.Array[LockFilePackage]] = js.undefined
}

object ComposerLockFile {
  @scala.inline
  def apply(packages: js.Array[LockFilePackage], `packages-dev`: js.Array[LockFilePackage] = null): ComposerLockFile = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    if (`packages-dev` != null) __obj.updateDynamic("packages-dev")(`packages-dev`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposerLockFile]
  }
}

