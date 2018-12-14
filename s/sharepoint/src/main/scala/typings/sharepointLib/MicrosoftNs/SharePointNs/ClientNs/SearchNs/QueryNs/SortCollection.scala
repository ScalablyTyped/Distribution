package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCollection
  extends sharepointLib.SPNs.ClientObjectCollection[Sort] {
  def add(strProperty: java.lang.String, sortDirection: SortDirection): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def get_childItemType(): org.scalablytyped.runtime.Instantiable0[Sort] = js.native
  def get_item(index: scala.Double): Sort = js.native
  def itemAt(index: scala.Double): Sort = js.native
}

