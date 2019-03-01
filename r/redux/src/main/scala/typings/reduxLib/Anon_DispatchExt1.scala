package typings
package reduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DispatchExt1[Ext1, Ext2] extends js.Object {
  var dispatch: Ext1 with Ext2
}

object Anon_DispatchExt1 {
  @scala.inline
  def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): Anon_DispatchExt1[Ext1, Ext2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DispatchExt1[Ext1, Ext2]]
  }
}

