package typings.reactDashGoogleDashMapsDashLoader.reactDashGoogleDashMapsDashLoaderMod.ReactGoogleMapsLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var key: String
  var libraries: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(key: String, libraries: String = null): Params = {
    val __obj = js.Dynamic.literal(key = key)
    if (libraries != null) __obj.updateDynamic("libraries")(libraries)
    __obj.asInstanceOf[Params]
  }
}

