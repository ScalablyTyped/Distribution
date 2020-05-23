package typings.snykCocoapodsLockfileParser.lockfileParserMod

import typings.snykDepGraph.typesMod.DepGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockfileParser extends js.Object {
  var checkoutOptionsForPod: js.Any
  var checksumForPod: js.Any
  var externalSourceInfoForPod: js.Any
  var internalData: js.Any
  var nodeIdForPkgInfo: js.Any
  var nodeInfoLabelsForPod: js.Any
  var repositoryForPod: js.Any
  var rootPkgInfo: js.Any
  /* private */ def cocoapodsVersion: js.Any
  /* private */ def pkgManager: js.Any
  def podfileChecksum: js.UndefOr[String]
  /* private */ def repositories: js.Any
  def toDepGraph(): DepGraph
}

object LockfileParser {
  @scala.inline
  def apply(
    checkoutOptionsForPod: js.Any,
    checksumForPod: js.Any,
    cocoapodsVersion: () => js.Any,
    externalSourceInfoForPod: js.Any,
    internalData: js.Any,
    nodeIdForPkgInfo: js.Any,
    nodeInfoLabelsForPod: js.Any,
    pkgManager: () => js.Any,
    podfileChecksum: () => js.UndefOr[String],
    repositories: () => js.Any,
    repositoryForPod: js.Any,
    rootPkgInfo: js.Any,
    toDepGraph: () => DepGraph
  ): LockfileParser = {
    val __obj = js.Dynamic.literal(checkoutOptionsForPod = checkoutOptionsForPod.asInstanceOf[js.Any], checksumForPod = checksumForPod.asInstanceOf[js.Any], cocoapodsVersion = js.Any.fromFunction0(cocoapodsVersion), externalSourceInfoForPod = externalSourceInfoForPod.asInstanceOf[js.Any], internalData = internalData.asInstanceOf[js.Any], nodeIdForPkgInfo = nodeIdForPkgInfo.asInstanceOf[js.Any], nodeInfoLabelsForPod = nodeInfoLabelsForPod.asInstanceOf[js.Any], pkgManager = js.Any.fromFunction0(pkgManager), podfileChecksum = js.Any.fromFunction0(podfileChecksum), repositories = js.Any.fromFunction0(repositories), repositoryForPod = repositoryForPod.asInstanceOf[js.Any], rootPkgInfo = rootPkgInfo.asInstanceOf[js.Any], toDepGraph = js.Any.fromFunction0(toDepGraph))
    __obj.asInstanceOf[LockfileParser]
  }
}

