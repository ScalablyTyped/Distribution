package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchInfo extends js.Object {
  /**
  	 * Total number of rows that match the current table filter/search properties.
  	 */
  var dataTotalSize: Double
}

object FetchInfo {
  @scala.inline
  def apply(dataTotalSize: Double): FetchInfo = {
    val __obj = js.Dynamic.literal(dataTotalSize = dataTotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchInfo]
  }
}

