package typings.seleniumWebdriver

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss extends ByHash {
  var css: String
}

object AnonCss {
  @scala.inline
  def apply(css: String): AnonCss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCss]
  }
}

