package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerModule extends js.Object {
  def create(): WebServer
}

object WebServerModule {
  @scala.inline
  def apply(create: () => WebServer): WebServerModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
  
    __obj.asInstanceOf[WebServerModule]
  }
}

