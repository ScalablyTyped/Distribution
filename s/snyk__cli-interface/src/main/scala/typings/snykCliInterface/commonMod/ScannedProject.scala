package typings.snykCliInterface.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScannedProject extends js.Object {
  var callGraph: js.UndefOr[CallGraph] = js.undefined
  var depTree: DepTree
  var meta: js.UndefOr[js.Any] = js.undefined
  var targetFile: js.UndefOr[String] = js.undefined
}

object ScannedProject {
  @scala.inline
  def apply(depTree: DepTree, callGraph: CallGraph = null, meta: js.Any = null, targetFile: String = null): ScannedProject = {
    val __obj = js.Dynamic.literal(depTree = depTree.asInstanceOf[js.Any])
    if (callGraph != null) __obj.updateDynamic("callGraph")(callGraph.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (targetFile != null) __obj.updateDynamic("targetFile")(targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannedProject]
  }
}

