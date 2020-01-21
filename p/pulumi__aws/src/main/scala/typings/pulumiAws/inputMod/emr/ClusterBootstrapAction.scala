package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBootstrapAction extends js.Object {
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the job flow
    */
  var name: Input[String] = js.native
  var path: Input[String] = js.native
}

object ClusterBootstrapAction {
  @scala.inline
  def apply(name: Input[String], path: Input[String], args: Input[js.Array[Input[String]]] = null): ClusterBootstrapAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBootstrapAction]
  }
}

