package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightUrl extends js.Object {
  var height: scala.Double
  var url: java.lang.String
  var width: scala.Double
}

object Anon_HeightUrl {
  @scala.inline
  def apply(height: scala.Double, url: java.lang.String, width: scala.Double): Anon_HeightUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_HeightUrl]
  }
}

