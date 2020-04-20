package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispatchExt[Ext] extends js.Object {
  var dispatch: Ext
}

object AnonDispatchExt {
  @scala.inline
  def apply[Ext](dispatch: Ext): AnonDispatchExt[Ext] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDispatchExt[Ext]]
  }
}

