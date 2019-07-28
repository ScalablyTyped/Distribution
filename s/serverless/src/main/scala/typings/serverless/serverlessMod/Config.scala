package typings.serverless.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var servicePath: String
}

object Config {
  @scala.inline
  def apply(servicePath: String): Config = {
    val __obj = js.Dynamic.literal(servicePath = servicePath)
  
    __obj.asInstanceOf[Config]
  }
}

