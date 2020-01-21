package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispatchExt1[Ext1, Ext2] extends js.Object {
  var dispatch: Ext1 with Ext2
}

object AnonDispatchExt1 {
  @scala.inline
  def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): AnonDispatchExt1[Ext1, Ext2] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDispatchExt1[Ext1, Ext2]]
  }
}

