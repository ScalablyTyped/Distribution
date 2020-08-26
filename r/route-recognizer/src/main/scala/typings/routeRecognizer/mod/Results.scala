package typings.routeRecognizer.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results
  extends ArrayLike[js.UndefOr[Result]] {
  var queryParams: QueryParams = js.native
  def push(results: Result*): Double = js.native
  def slice(): js.Array[Result] = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[Result] = js.native
  def slice(start: Double): js.Array[Result] = js.native
  def slice(start: Double, end: Double): js.Array[Result] = js.native
  def splice(start: Double, deleteCount: Double, items: Result*): js.Array[Result] = js.native
}

