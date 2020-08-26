package typings.satnav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavigationOptions extends js.Object {
  var directions: js.UndefOr[js.Function1[/* params */ js.Any, _]] = js.native
  var path: js.UndefOr[String] = js.native
  var title: js.UndefOr[String | Callback] = js.native
}

object INavigationOptions {
  @scala.inline
  def apply(): INavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationOptions]
  }
  @scala.inline
  implicit class INavigationOptionsOps[Self <: INavigationOptions] (val x: Self) extends AnyVal {
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
    def setDirections(value: /* params */ js.Any => _): Self = this.set("directions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDirections: Self = this.set("directions", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTitleFunction0(value: () => Unit): Self = this.set("title", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: String | Callback): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

