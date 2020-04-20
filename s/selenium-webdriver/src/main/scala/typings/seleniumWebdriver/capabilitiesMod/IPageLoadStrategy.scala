package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageLoadStrategy extends js.Object {
  /**
    * Indicates WebDriver should wait for the document readiness state to
    * become "interactive" after navigation.
    */
  var EAGER: String
  /**
    * Indicates WebDriver should not wait on the document readiness state after a
    * navigation event.
    */
  var NONE: String
  /**
    * Indicates WebDriver should wait for the document readiness state to
    * be "complete" after navigation. This is the default page loading strategy.
    */
  var NORMAL: String
}

object IPageLoadStrategy {
  @scala.inline
  def apply(EAGER: String, NONE: String, NORMAL: String): IPageLoadStrategy = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageLoadStrategy]
  }
}

