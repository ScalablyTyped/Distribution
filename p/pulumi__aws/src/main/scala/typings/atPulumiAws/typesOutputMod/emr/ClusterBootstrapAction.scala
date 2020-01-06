package typings.atPulumiAws.typesOutputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBootstrapAction extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the job flow
    */
  var name: String = js.native
  var path: String = js.native
}

object ClusterBootstrapAction {
  @scala.inline
  def apply(name: String, path: String, args: js.Array[String] = null): ClusterBootstrapAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBootstrapAction]
  }
}

