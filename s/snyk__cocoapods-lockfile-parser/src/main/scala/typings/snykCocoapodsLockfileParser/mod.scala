package typings.snykCocoapodsLockfileParser

import typings.snykCocoapodsLockfileParser.lockfileParserMod.default
import typings.snykCocoapodsLockfileParser.typesMod.Lockfile
import typings.snykDepGraph.typesMod.PkgInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/cocoapods-lockfile-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LockfileParser protected () extends default {
    def this(hash: Lockfile) = this()
    def this(hash: Lockfile, rootPkgInfo: PkgInfo) = this()
  }
  
  /* static members */
  @js.native
  object LockfileParser extends js.Object {
    def readContents(contents: String): typings.snykCocoapodsLockfileParser.lockfileParserMod.LockfileParser = js.native
    def readContents(contents: String, rootPkgInfo: PkgInfo): typings.snykCocoapodsLockfileParser.lockfileParserMod.LockfileParser = js.native
    def readFile(lockfilePath: String): js.Promise[typings.snykCocoapodsLockfileParser.lockfileParserMod.LockfileParser] = js.native
    def readFileSync(lockfilePath: String): typings.snykCocoapodsLockfileParser.lockfileParserMod.LockfileParser = js.native
  }
  
}

