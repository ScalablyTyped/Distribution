package typings.statuses.statusesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var STATUS_CODES: NumberDictionary[String] = js.native
  var codes: js.Array[Double] = js.native
  var empty: NumberDictionary[js.UndefOr[Boolean]] = js.native
  var redirect: NumberDictionary[js.UndefOr[Boolean]] = js.native
  var retry: NumberDictionary[js.UndefOr[Boolean]] = js.native
  def apply(code: String): Double = js.native
  def apply(code: Double): Double = js.native
}

