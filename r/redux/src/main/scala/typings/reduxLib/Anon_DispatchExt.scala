package typings
package reduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DispatchExt[Ext] extends js.Object {
  var dispatch: Ext
}

object Anon_DispatchExt {
  @scala.inline
  def apply[Ext](dispatch: Ext): Anon_DispatchExt[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DispatchExt[Ext]]
  }
}

