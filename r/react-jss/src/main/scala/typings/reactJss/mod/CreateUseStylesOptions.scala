package typings.reactJss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUseStylesOptions[Theme] extends BaseOptions[Theme] {
  var name: js.UndefOr[String] = js.native
}

object CreateUseStylesOptions {
  @scala.inline
  def apply[Theme](): CreateUseStylesOptions[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUseStylesOptions[Theme]]
  }
  @scala.inline
  implicit class CreateUseStylesOptionsOps[Self <: CreateUseStylesOptions[_], Theme] (val x: Self with CreateUseStylesOptions[Theme]) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

