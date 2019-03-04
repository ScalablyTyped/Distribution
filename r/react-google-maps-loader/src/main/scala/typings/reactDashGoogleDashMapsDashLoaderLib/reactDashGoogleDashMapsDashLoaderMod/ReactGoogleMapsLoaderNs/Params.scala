package typings
package reactDashGoogleDashMapsDashLoaderLib.reactDashGoogleDashMapsDashLoaderMod.ReactGoogleMapsLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var key: java.lang.String
  var libraries: js.UndefOr[java.lang.String] = js.undefined
}

object Params {
  @scala.inline
  def apply(key: java.lang.String, libraries: java.lang.String = null): Params = {
    val __obj = js.Dynamic.literal(key = key)
    if (libraries != null) __obj.updateDynamic("libraries")(libraries)
    __obj.asInstanceOf[Params]
  }
}

