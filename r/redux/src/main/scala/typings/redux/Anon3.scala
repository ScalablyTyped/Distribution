package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3[Ext1, Ext2, Ext3, Ext4, Ext5] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 with Ext4 with Ext5
}

object Anon3 {
  @scala.inline
  def apply[Ext1, Ext2, Ext3, Ext4, Ext5](dispatch: Ext1 with Ext2 with Ext3 with Ext4 with Ext5): Anon3[Ext1, Ext2, Ext3, Ext4, Ext5] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon3[Ext1, Ext2, Ext3, Ext4, Ext5]]
  }
}

