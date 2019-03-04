package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerModule extends js.Object {
  def create(): WebServer
}

object WebServerModule {
  @scala.inline
  def apply(create: js.Function0[WebServer]): WebServerModule = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[WebServerModule]
  }
}

