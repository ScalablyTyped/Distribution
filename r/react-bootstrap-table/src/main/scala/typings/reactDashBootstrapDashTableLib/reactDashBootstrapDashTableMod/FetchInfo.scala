package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchInfo extends js.Object {
  /**
  	 * Total number of rows that match the current table filter/search properties.
  	 */
  var dataTotalSize: scala.Double
}

object FetchInfo {
  @scala.inline
  def apply(dataTotalSize: scala.Double): FetchInfo = {
    val __obj = js.Dynamic.literal(dataTotalSize = dataTotalSize)
  
    __obj.asInstanceOf[FetchInfo]
  }
}

