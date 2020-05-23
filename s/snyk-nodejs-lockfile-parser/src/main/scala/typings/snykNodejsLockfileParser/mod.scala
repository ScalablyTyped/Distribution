package typings.snykNodejsLockfileParser

import typings.snykNodejsLockfileParser.parsersMod.LockfileType
import typings.snykNodejsLockfileParser.parsersMod.PkgTree
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserBooleans.`false`
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.npm
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-nodejs-lockfile-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InvalidUserInputError protected ()
    extends typings.snykNodejsLockfileParser.errorsMod.InvalidUserInputError {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class OutOfSyncError protected ()
    extends typings.snykNodejsLockfileParser.errorsMod.OutOfSyncError {
    def this(dependencyName: String, lockFileType: npm) = this()
    def this(dependencyName: String, lockFileType: yarn) = this()
  }
  
  @js.native
  class UnsupportedRuntimeError protected ()
    extends typings.snykNodejsLockfileParser.errorsMod.UnsupportedRuntimeError {
    def this(args: js.Any*) = this()
  }
  
  def buildDepTree(manifestFileContents: String, lockFileContents: String): js.Promise[PkgTree] = js.native
  def buildDepTree(manifestFileContents: String, lockFileContents: String, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def buildDepTree(
    manifestFileContents: String,
    lockFileContents: String,
    includeDev: Boolean,
    lockfileType: LockfileType
  ): js.Promise[PkgTree] = js.native
  def buildDepTree(
    manifestFileContents: String,
    lockFileContents: String,
    includeDev: Boolean,
    lockfileType: LockfileType,
    strict: Boolean
  ): js.Promise[PkgTree] = js.native
  def buildDepTree(
    manifestFileContents: String,
    lockFileContents: String,
    includeDev: Boolean,
    lockfileType: LockfileType,
    strict: Boolean,
    defaultManifestFileName: String
  ): js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, lockFilePath: String): js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, lockFilePath: String, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, lockFilePath: String, includeDev: Boolean, strict: Boolean): js.Promise[PkgTree] = js.native
  def getYarnWorkspaces(targetFile: String): js.Array[String] | `false` = js.native
  def getYarnWorkspacesFromFiles(root: js.Any, manifestFilePath: String): js.Array[String] | `false` = js.native
  @js.native
  object LockfileType extends js.Object {
    /* "npm" */ val npm: typings.snykNodejsLockfileParser.parsersMod.LockfileType.npm with String = js.native
    /* "yarn" */ val yarn: typings.snykNodejsLockfileParser.parsersMod.LockfileType.yarn with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.snykNodejsLockfileParser.parsersMod.LockfileType with String] = js.native
  }
  
  @js.native
  object Scope extends js.Object {
    /* "dev" */ val dev: typings.snykNodejsLockfileParser.parsersMod.Scope.dev with String = js.native
    /* "prod" */ val prod: typings.snykNodejsLockfileParser.parsersMod.Scope.prod with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.snykNodejsLockfileParser.parsersMod.Scope with String] = js.native
  }
  
}

