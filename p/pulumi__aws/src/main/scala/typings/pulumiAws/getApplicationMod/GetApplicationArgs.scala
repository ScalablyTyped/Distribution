package typings.pulumiAws.getApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationArgs extends js.Object {
  /**
    * The name of the application
    */
  val name: String = js.native
}

object GetApplicationArgs {
  @scala.inline
  def apply(name: String): GetApplicationArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationArgs]
  }
}

