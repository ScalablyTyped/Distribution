package typings.seleniumWebdriver

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJs extends ByHash {
  @JSName("js")
  var js_ : String
}

object AnonJs {
  @scala.inline
  def apply(js_ : String): AnonJs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJs]
  }
}

