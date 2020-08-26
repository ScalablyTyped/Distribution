package typings.protractorHelpers.mod.global.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementFinder extends js.Object {
  @JSName("$data")
  def $data(hook: String): ElementFinder = js.native
}

object ElementFinder {
  @scala.inline
  def apply($data: String => ElementFinder): ElementFinder = {
    val __obj = js.Dynamic.literal($data = js.Any.fromFunction1($data))
    __obj.asInstanceOf[ElementFinder]
  }
  @scala.inline
  implicit class ElementFinderOps[Self <: ElementFinder] (val x: Self) extends AnyVal {
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
    def set$data(value: String => ElementFinder): Self = this.set("$data", js.Any.fromFunction1(value))
  }
  
}

