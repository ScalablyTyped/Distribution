package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchExt[Ext] extends js.Object {
  var dispatch: Ext
}

object DispatchExt {
  @scala.inline
  def apply[Ext](dispatch: Ext): DispatchExt[Ext] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchExt[Ext]]
  }
}

