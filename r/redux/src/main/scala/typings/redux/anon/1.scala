package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[Ext1, Ext2, Ext3] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3
}

object `1` {
  @scala.inline
  def apply[Ext1, Ext2, Ext3](dispatch: Ext1 with Ext2 with Ext3): `1`[Ext1, Ext2, Ext3] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[Ext1, Ext2, Ext3]]
  }
}

