package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[Ext1, Ext2] extends js.Object {
  var dispatch: Ext1 with Ext2
}

object Anon0 {
  @scala.inline
  def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): Anon0[Ext1, Ext2] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0[Ext1, Ext2]]
  }
}

