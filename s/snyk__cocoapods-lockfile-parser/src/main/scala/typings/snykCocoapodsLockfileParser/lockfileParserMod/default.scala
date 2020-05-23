package typings.snykCocoapodsLockfileParser.lockfileParserMod

import typings.snykCocoapodsLockfileParser.typesMod.Lockfile
import typings.snykDepGraph.typesMod.DepGraph
import typings.snykDepGraph.typesMod.PkgInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/cocoapods-lockfile-parser/dist/lockfile-parser", JSImport.Default)
@js.native
class default protected () extends LockfileParser {
  def this(hash: Lockfile) = this()
  def this(hash: Lockfile, rootPkgInfo: PkgInfo) = this()
  /* CompleteClass */
  override var checkoutOptionsForPod: js.Any = js.native
  /* CompleteClass */
  override var checksumForPod: js.Any = js.native
  /* CompleteClass */
  override var externalSourceInfoForPod: js.Any = js.native
  /* CompleteClass */
  override var internalData: js.Any = js.native
  /* CompleteClass */
  override var nodeIdForPkgInfo: js.Any = js.native
  /* CompleteClass */
  override var nodeInfoLabelsForPod: js.Any = js.native
  /* CompleteClass */
  override var repositoryForPod: js.Any = js.native
  /* CompleteClass */
  override var rootPkgInfo: js.Any = js.native
  /* CompleteClass */
  /* private */ override def cocoapodsVersion: js.Any = js.native
  /* CompleteClass */
  /* private */ override def pkgManager: js.Any = js.native
  /* CompleteClass */
  override def podfileChecksum: js.UndefOr[String] = js.native
  /* CompleteClass */
  /* private */ override def repositories: js.Any = js.native
  /* CompleteClass */
  override def toDepGraph(): DepGraph = js.native
}

/* static members */
@JSImport("@snyk/cocoapods-lockfile-parser/dist/lockfile-parser", JSImport.Default)
@js.native
object default extends js.Object {
  def readContents(contents: String): LockfileParser = js.native
  def readContents(contents: String, rootPkgInfo: PkgInfo): LockfileParser = js.native
  def readFile(lockfilePath: String): js.Promise[LockfileParser] = js.native
  def readFileSync(lockfilePath: String): LockfileParser = js.native
}

