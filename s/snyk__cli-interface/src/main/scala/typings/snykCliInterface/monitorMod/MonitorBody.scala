package typings.snykCliInterface.monitorMod

import typings.snykCliInterface.commonMod.DepTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorBody extends js.Object {
  @JSName("package")
  var _package: DepTree
  var meta: MonitorMeta
  var policy: String
  var targetFile: String
}

object MonitorBody {
  @scala.inline
  def apply(_package: DepTree, meta: MonitorMeta, policy: String, targetFile: String): MonitorBody = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorBody]
  }
}

