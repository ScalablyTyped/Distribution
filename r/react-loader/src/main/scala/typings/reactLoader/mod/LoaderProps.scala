package typings.reactLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderProps extends LoaderOptions {
  var className: js.UndefOr[String] = js.native
  var loaded: Boolean = js.native
  var options: js.UndefOr[LoaderOptions] = js.native
}

object LoaderProps {
  @scala.inline
  def apply(loaded: Boolean): LoaderProps = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
  @scala.inline
  implicit class LoaderPropsOps[Self <: LoaderProps] (val x: Self) extends AnyVal {
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
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOptions(value: LoaderOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

