package typings.reactNativeCommunityCli.anon

import typings.reactNativeCommunityCli.mod.Config_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default extends js.Object {
  var default: js.UndefOr[
    String | Boolean | Double | (js.Function1[/* ctx */ Config_, String | Boolean | Double])
  ] = js.native
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var parse: js.UndefOr[js.Function1[/* val */ String, _]] = js.native
}

object Default {
  @scala.inline
  def apply(name: String): Default = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
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
    def setDefaultFunction1(value: /* ctx */ Config_ => String | Boolean | Double): Self = this.set("default", js.Any.fromFunction1(value))
    @scala.inline
    def setDefault(value: String | Boolean | Double | (js.Function1[/* ctx */ Config_, String | Boolean | Double])): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setParse(value: /* val */ String => _): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
  }
  
}

