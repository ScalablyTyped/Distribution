package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Js extends ByHash {
  @JSName("js")
  var js_ : String
}

object Js {
  @scala.inline
  def apply(js_ : String): Js = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
}

