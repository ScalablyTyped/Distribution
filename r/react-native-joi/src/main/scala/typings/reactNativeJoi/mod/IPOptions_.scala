package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPOptions_ extends js.Object {
  var cidr: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[js.Array[String]] = js.undefined
}

object IPOptions_ {
  @scala.inline
  def apply(cidr: String = null, version: js.Array[String] = null): IPOptions_ = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPOptions_]
  }
}

