package typings.pulumiAws.getConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationArgs extends js.Object {
  /**
    * Name of the configuration.
    */
  val name: String = js.native
}

object GetConfigurationArgs {
  @scala.inline
  def apply(name: String): GetConfigurationArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConfigurationArgs]
  }
}

