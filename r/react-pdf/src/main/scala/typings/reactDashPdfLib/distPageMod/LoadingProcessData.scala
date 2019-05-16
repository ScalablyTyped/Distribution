package typings
package reactDashPdfLib.distPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingProcessData extends js.Object {
  var loaded: scala.Double
  var total: scala.Double
}

object LoadingProcessData {
  @scala.inline
  def apply(loaded: scala.Double, total: scala.Double): LoadingProcessData = {
    val __obj = js.Dynamic.literal(loaded = loaded, total = total)
  
    __obj.asInstanceOf[LoadingProcessData]
  }
}

