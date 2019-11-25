package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser extends js.Object {
  var Browser: String
  var `Browser-Height`: Double
  var `Browser-Name`: String
  var `Browser-Version`: String
  var `Browser-Width`: Double
  var `Color-Depth`: Double
  var `Document-Mode`: Double
  var Platform: String
  var `Screen-Height`: Double
  var `Screen-Width`: Double
  var `User-Language`: String
  var UtcOffset: Double
}

object Anon_Browser {
  @scala.inline
  def apply(
    Browser: String,
    `Browser-Height`: Double,
    `Browser-Name`: String,
    `Browser-Version`: String,
    `Browser-Width`: Double,
    `Color-Depth`: Double,
    `Document-Mode`: Double,
    Platform: String,
    `Screen-Height`: Double,
    `Screen-Width`: Double,
    `User-Language`: String,
    UtcOffset: Double
  ): Anon_Browser = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], UtcOffset = UtcOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Height")(`Browser-Height`.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Name")(`Browser-Name`.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Version")(`Browser-Version`.asInstanceOf[js.Any])
    __obj.updateDynamic("Browser-Width")(`Browser-Width`.asInstanceOf[js.Any])
    __obj.updateDynamic("Color-Depth")(`Color-Depth`.asInstanceOf[js.Any])
    __obj.updateDynamic("Document-Mode")(`Document-Mode`.asInstanceOf[js.Any])
    __obj.updateDynamic("Screen-Height")(`Screen-Height`.asInstanceOf[js.Any])
    __obj.updateDynamic("Screen-Width")(`Screen-Width`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Language")(`User-Language`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Browser]
  }
}

