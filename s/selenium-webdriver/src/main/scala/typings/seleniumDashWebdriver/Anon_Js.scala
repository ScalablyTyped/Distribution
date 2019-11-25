package typings.seleniumDashWebdriver

import typings.seleniumDashWebdriver.libByMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Js extends ByHash {
  @JSName("js")
  var js_ : String
}

object Anon_Js {
  @scala.inline
  def apply(js_ : String): Anon_Js = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Js]
  }
}

