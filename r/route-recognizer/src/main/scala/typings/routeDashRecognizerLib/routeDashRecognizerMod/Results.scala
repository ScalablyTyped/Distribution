package typings
package routeDashRecognizerLib.routeDashRecognizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results
  extends stdLib.ArrayLike[js.UndefOr[Result]] {
  var queryParams: QueryParams = js.native
  def push(results: Result*): scala.Double = js.native
  def slice(): js.Array[Result] = js.native
  def slice(start: scala.Double): js.Array[Result] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[Result] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, items: Result*): js.Array[Result] = js.native
}

