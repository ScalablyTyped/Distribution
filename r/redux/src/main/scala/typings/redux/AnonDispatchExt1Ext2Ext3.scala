package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispatchExt1Ext2Ext3[Ext1, Ext2, Ext3, Ext4] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3 with Ext4
}

object AnonDispatchExt1Ext2Ext3 {
  @scala.inline
  def apply[Ext1, Ext2, Ext3, Ext4](dispatch: Ext1 with Ext2 with Ext3 with Ext4): AnonDispatchExt1Ext2Ext3[Ext1, Ext2, Ext3, Ext4] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDispatchExt1Ext2Ext3[Ext1, Ext2, Ext3, Ext4]]
  }
}

