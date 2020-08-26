package typings.reactFns.localesLocalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalesProps extends js.Object {
  var locale: String = js.native
}

object LocalesProps {
  @scala.inline
  def apply(locale: String): LocalesProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalesProps]
  }
  @scala.inline
  implicit class LocalesPropsOps[Self <: LocalesProps] (val x: Self) extends AnyVal {
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
  
}

