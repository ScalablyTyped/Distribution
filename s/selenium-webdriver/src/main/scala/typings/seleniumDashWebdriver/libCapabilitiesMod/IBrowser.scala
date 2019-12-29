package typings.seleniumDashWebdriver.libCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowser extends js.Object {
  var CHROME: String
  var EDGE: String
  var FIREFOX: String
  var IE: String
  var INTERNET_EXPLORER: String
  var SAFARI: String
}

object IBrowser {
  @scala.inline
  def apply(
    CHROME: String,
    EDGE: String,
    FIREFOX: String,
    IE: String,
    INTERNET_EXPLORER: String,
    SAFARI: String
  ): IBrowser = {
    val __obj = js.Dynamic.literal(CHROME = CHROME.asInstanceOf[js.Any], EDGE = EDGE.asInstanceOf[js.Any], FIREFOX = FIREFOX.asInstanceOf[js.Any], IE = IE.asInstanceOf[js.Any], INTERNET_EXPLORER = INTERNET_EXPLORER.asInstanceOf[js.Any], SAFARI = SAFARI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBrowser]
  }
}

