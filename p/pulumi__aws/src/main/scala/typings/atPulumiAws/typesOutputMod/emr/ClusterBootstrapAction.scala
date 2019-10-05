package typings.atPulumiAws.typesOutputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterBootstrapAction extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the job flow
    */
  var name: String
  var path: String
}

object ClusterBootstrapAction {
  @scala.inline
  def apply(name: String, path: String, args: js.Array[String] = null): ClusterBootstrapAction = {
    val __obj = js.Dynamic.literal(name = name, path = path)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[ClusterBootstrapAction]
  }
}

