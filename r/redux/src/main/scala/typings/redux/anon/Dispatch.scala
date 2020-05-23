package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispatch[Ext1] extends js.Object {
  var dispatch: Ext1
}

object Dispatch {
  @scala.inline
  def apply[Ext1](dispatch: Ext1): Dispatch[Ext1] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispatch[Ext1]]
  }
}

