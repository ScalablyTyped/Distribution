package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[Ext1, Ext2] extends js.Object {
  var dispatch: Ext1 with Ext2
}

object `0` {
  @scala.inline
  def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): `0`[Ext1, Ext2] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[Ext1, Ext2]]
  }
}

