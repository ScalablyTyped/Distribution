package typings
package reduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DispatchExt1Ext2[Ext1, Ext2, Ext3] extends js.Object {
  var dispatch: Ext1 with Ext2 with Ext3
}

object Anon_DispatchExt1Ext2 {
  @scala.inline
  def apply[Ext1, Ext2, Ext3](dispatch: Ext1 with Ext2 with Ext3): Anon_DispatchExt1Ext2[Ext1, Ext2, Ext3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DispatchExt1Ext2[Ext1, Ext2, Ext3]]
  }
}

