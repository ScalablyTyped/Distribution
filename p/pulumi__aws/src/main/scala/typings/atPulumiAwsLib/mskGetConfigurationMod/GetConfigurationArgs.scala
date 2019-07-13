package typings
package atPulumiAwsLib.mskGetConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigurationArgs extends js.Object {
  /**
    * Name of the configuration.
    */
  val name: java.lang.String
}

object GetConfigurationArgs {
  @scala.inline
  def apply(name: java.lang.String): GetConfigurationArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetConfigurationArgs]
  }
}

