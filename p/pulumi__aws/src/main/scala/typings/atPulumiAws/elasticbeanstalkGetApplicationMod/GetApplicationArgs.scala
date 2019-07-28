package typings.atPulumiAws.elasticbeanstalkGetApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationArgs extends js.Object {
  /**
    * The name of the application
    */
  val name: String
}

object GetApplicationArgs {
  @scala.inline
  def apply(name: String): GetApplicationArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetApplicationArgs]
  }
}

