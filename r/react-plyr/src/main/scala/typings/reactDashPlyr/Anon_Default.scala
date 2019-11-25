package typings.reactDashPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[String | Double] = js.undefined
  var option: js.UndefOr[js.Array[Double | String]] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(default: String | Double = null, option: js.Array[Double | String] = null): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

