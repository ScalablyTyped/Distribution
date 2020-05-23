package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blackberry extends js.Object {
  var blackberry: js.Any
  var blackberry10: js.Any
  var chrome: js.Any
  var device: js.Any
  var firefox: js.Any
  var opera: js.Any
}

object Blackberry {
  @scala.inline
  def apply(
    blackberry: js.Any,
    blackberry10: js.Any,
    chrome: js.Any,
    device: js.Any,
    firefox: js.Any,
    opera: js.Any
  ): Blackberry = {
    val __obj = js.Dynamic.literal(blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blackberry]
  }
}

