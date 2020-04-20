package typings.serverless.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var servicePath: String
}

object Config {
  @scala.inline
  def apply(servicePath: String): Config = {
    val __obj = js.Dynamic.literal(servicePath = servicePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

