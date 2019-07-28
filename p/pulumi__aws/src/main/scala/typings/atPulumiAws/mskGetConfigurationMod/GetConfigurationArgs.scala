package typings.atPulumiAws.mskGetConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigurationArgs extends js.Object {
  /**
    * Name of the configuration.
    */
  val name: String
}

object GetConfigurationArgs {
  @scala.inline
  def apply(name: String): GetConfigurationArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetConfigurationArgs]
  }
}

