package typings.snykNodejsLockfileParser.parsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockfileParser extends js.Object {
  def getDependencyTree(manifestFile: ManifestFile, lockfile: Lockfile): js.Promise[PkgTree] = js.native
  def getDependencyTree(manifestFile: ManifestFile, lockfile: Lockfile, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def getDependencyTree(manifestFile: ManifestFile, lockfile: Lockfile, includeDev: Boolean, strict: Boolean): js.Promise[PkgTree] = js.native
  def parseLockFile(lockFileContents: String): Lockfile = js.native
}

