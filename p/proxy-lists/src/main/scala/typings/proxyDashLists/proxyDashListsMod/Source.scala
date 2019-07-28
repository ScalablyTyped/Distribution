package typings.proxyDashLists.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var homeUrl: String
  var name: String
}

object Source {
  @scala.inline
  def apply(homeUrl: String, name: String): Source = {
    val __obj = js.Dynamic.literal(homeUrl = homeUrl, name = name)
  
    __obj.asInstanceOf[Source]
  }
}

