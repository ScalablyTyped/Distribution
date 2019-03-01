package typings
package atPulumiAwsLib.elasticbeanstalkGetApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationArgs extends js.Object {
  /**
    * The name of the application
    */
  val name: java.lang.String
}

object GetApplicationArgs {
  @scala.inline
  def apply(name: java.lang.String): GetApplicationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetApplicationArgs]
  }
}

