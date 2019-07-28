package typings.reactDashPdf.distPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingProcessData extends js.Object {
  var loaded: Double
  var total: Double
}

object LoadingProcessData {
  @scala.inline
  def apply(loaded: Double, total: Double): LoadingProcessData = {
    val __obj = js.Dynamic.literal(loaded = loaded, total = total)
  
    __obj.asInstanceOf[LoadingProcessData]
  }
}

