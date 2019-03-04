package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser extends js.Object {
  var Browser: java.lang.String
  var `Browser-Height`: scala.Double
  var `Browser-Name`: java.lang.String
  var `Browser-Version`: java.lang.String
  var `Browser-Width`: scala.Double
  var `Color-Depth`: scala.Double
  var `Document-Mode`: scala.Double
  var Platform: java.lang.String
  var `Screen-Height`: scala.Double
  var `Screen-Width`: scala.Double
  var `User-Language`: java.lang.String
  var UtcOffset: scala.Double
}

object Anon_Browser {
  @scala.inline
  def apply(
    Browser: java.lang.String,
    `Browser-Height`: scala.Double,
    `Browser-Name`: java.lang.String,
    `Browser-Version`: java.lang.String,
    `Browser-Width`: scala.Double,
    `Color-Depth`: scala.Double,
    `Document-Mode`: scala.Double,
    Platform: java.lang.String,
    `Screen-Height`: scala.Double,
    `Screen-Width`: scala.Double,
    `User-Language`: java.lang.String,
    UtcOffset: scala.Double
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

