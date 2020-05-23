package typings.reduxBootstrap.interfacesMod.interfaces

import typings.reduxBootstrap.anon.Accept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeModule extends js.Object {
  var hot: Accept
}

object NodeModule {
  @scala.inline
  def apply(hot: Accept): NodeModule = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
}

