package typings
package reduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispatch[Ext1] extends js.Object {
  var dispatch: Ext1
}

object Anon_Dispatch {
  @scala.inline
  def apply[Ext1](dispatch: Ext1): Anon_Dispatch[Ext1] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dispatch[Ext1]]
  }
}

