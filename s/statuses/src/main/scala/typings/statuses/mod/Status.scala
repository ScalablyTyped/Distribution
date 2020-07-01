package typings.statuses.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var code: StringDictionary[js.UndefOr[Double]] = js.native
  var codes: js.Array[Double] = js.native
  var empty: NumberDictionary[js.UndefOr[Boolean]] = js.native
  var message: NumberDictionary[js.UndefOr[String]] = js.native
  var redirect: NumberDictionary[js.UndefOr[Boolean]] = js.native
  var retry: NumberDictionary[js.UndefOr[Boolean]] = js.native
  def apply(code_msg: String): Double | String = js.native
  def apply(code_msg: Double): Double | String = js.native
}

