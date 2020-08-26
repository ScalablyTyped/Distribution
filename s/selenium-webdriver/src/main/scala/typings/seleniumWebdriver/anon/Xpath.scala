package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.byMod.ByHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xpath extends ByHash {
  var xpath: String = js.native
}

object Xpath {
  @scala.inline
  def apply(xpath: String): Xpath = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xpath]
  }
  @scala.inline
  implicit class XpathOps[Self <: Xpath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setXpath(value: String): Self = this.set("xpath", value.asInstanceOf[js.Any])
  }
  
}

