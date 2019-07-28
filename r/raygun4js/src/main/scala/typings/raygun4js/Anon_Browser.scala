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
    val __obj = js.Dynamic.literal(Browser = Browser, Platform = Platform, UtcOffset = UtcOffset)
    __obj.updateDynamic("Browser-Height")(`Browser-Height`)
    __obj.updateDynamic("Browser-Name")(`Browser-Name`)
    __obj.updateDynamic("Browser-Version")(`Browser-Version`)
    __obj.updateDynamic("Browser-Width")(`Browser-Width`)
    __obj.updateDynamic("Color-Depth")(`Color-Depth`)
    __obj.updateDynamic("Document-Mode")(`Document-Mode`)
    __obj.updateDynamic("Screen-Height")(`Screen-Height`)
    __obj.updateDynamic("Screen-Width")(`Screen-Width`)
    __obj.updateDynamic("User-Language")(`User-Language`)
    __obj.asInstanceOf[Anon_Browser]
  }
}

