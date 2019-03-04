package typings
package smoothDashScrollbarLib.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollStatus extends js.Object {
  var limit: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d
  var offset: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d
}

object ScrollStatus {
  @scala.inline
  def apply(
    limit: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d,
    offset: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d
  ): ScrollStatus = {
    val __obj = js.Dynamic.literal(limit = limit, offset = offset)
  
    __obj.asInstanceOf[ScrollStatus]
  }
}

