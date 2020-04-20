package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2[Ext1, Ext2, Ext3, Ext4] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 with Ext4
}

object Anon2 {
  @scala.inline
  def apply[Ext1, Ext2, Ext3, Ext4](dispatch: Ext1 with Ext2 with Ext3 with Ext4): Anon2[Ext1, Ext2, Ext3, Ext4] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2[Ext1, Ext2, Ext3, Ext4]]
  }
}

