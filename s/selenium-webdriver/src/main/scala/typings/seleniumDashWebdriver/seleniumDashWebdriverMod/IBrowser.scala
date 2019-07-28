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
    val __obj = js.Dynamic.literal(ANDROID = ANDROID, CHROME = CHROME, EDGE = EDGE, FIREFOX = FIREFOX, HTMLUNIT = HTMLUNIT, IE = IE, INTERNET_EXPLORER = INTERNET_EXPLORER, IPAD = IPAD, IPHONE = IPHONE, OPERA = OPERA, PHANTOM_JS = PHANTOM_JS, SAFARI = SAFARI)
  
    __obj.asInstanceOf[IBrowser]
  }
}

