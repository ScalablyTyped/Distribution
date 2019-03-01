package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var total: qiniuDashJsLib.Anon_Loaded
}

object Next {
  @scala.inline
  def apply(total: qiniuDashJsLib.Anon_Loaded): Next = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Next]
  }
}

