package typings.reactPdf.pageMod

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
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoadingProcessData]
  }
}

