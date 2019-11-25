package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowser extends js.Object {
  var ANDROID: String
  var CHROME: String
  var EDGE: String
  var FIREFOX: String
  var HTMLUNIT: String
  var IE: String
  var INTERNET_EXPLORER: String
  var IPAD: String
  var IPHONE: String
  var OPERA: String
  var PHANTOM_JS: String
  var SAFARI: String
}

object IBrowser {
  @scala.inline
  def apply(
    ANDROID: String,
    CHROME: String,
    EDGE: String,
    FIREFOX: String,
    HTMLUNIT: String,
    IE: String,
    INTERNET_EXPLORER: String,
    IPAD: String,
    IPHONE: String,
    OPERA: String,
    PHANTOM_JS: String,
    SAFARI: String
  ): IBrowser = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], CHROME = CHROME.asInstanceOf[js.Any], EDGE = EDGE.asInstanceOf[js.Any], FIREFOX = FIREFOX.asInstanceOf[js.Any], HTMLUNIT = HTMLUNIT.asInstanceOf[js.Any], IE = IE.asInstanceOf[js.Any], INTERNET_EXPLORER = INTERNET_EXPLORER.asInstanceOf[js.Any], IPAD = IPAD.asInstanceOf[js.Any], IPHONE = IPHONE.asInstanceOf[js.Any], OPERA = OPERA.asInstanceOf[js.Any], PHANTOM_JS = PHANTOM_JS.asInstanceOf[js.Any], SAFARI = SAFARI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBrowser]
  }
}

