package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTests extends js.Object {
  val requiredExtensions: SVGStringList = js.native
  val systemLanguage: SVGStringList = js.native
}

object SVGTests {
  @scala.inline
  def apply(requiredExtensions: SVGStringList, systemLanguage: SVGStringList): SVGTests = {
    val __obj = js.Dynamic.literal(requiredExtensions = requiredExtensions.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTests]
  }
  @scala.inline
  implicit class SVGTestsOps[Self <: SVGTests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
  }
  
}

