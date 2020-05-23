package typings.redux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2`[Ext1, Ext2, Ext3, Ext4] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 with Ext4
}

object `2` {
  @scala.inline
  def apply[Ext1, Ext2, Ext3, Ext4](dispatch: Ext1 with Ext2 with Ext3 with Ext4): `2`[Ext1, Ext2, Ext3, Ext4] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`[Ext1, Ext2, Ext3, Ext4]]
  }
}

