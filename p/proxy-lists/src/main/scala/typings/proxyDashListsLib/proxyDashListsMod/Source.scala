package typings
package proxyDashListsLib.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var homeUrl: java.lang.String
  var name: java.lang.String
}

object Source {
  @scala.inline
  def apply(homeUrl: java.lang.String, name: java.lang.String): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("homeUrl")(homeUrl)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Source]
  }
}

