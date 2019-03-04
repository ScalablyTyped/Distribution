package typings
package serverlessLib.serverlessMod.ServerlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var servicePath: java.lang.String
}

object Config {
  @scala.inline
  def apply(servicePath: java.lang.String): Config = {
    val __obj = js.Dynamic.literal(servicePath = servicePath)
  
    __obj.asInstanceOf[Config]
  }
}

