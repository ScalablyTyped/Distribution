package typings.reactShare.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareCountComponentProps extends js.Object {
  /** Supply a function as the child to render anything but the count */
  var children: js.UndefOr[js.Function1[/* shareCount */ Double, ReactNode]] = js.native
  /** Classes to apply (if any) */
  var className: js.UndefOr[String] = js.native
  /** The URL you are sharing */
  var url: String = js.native
}

object ShareCountComponentProps {
  @scala.inline
  def apply(url: String): ShareCountComponentProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareCountComponentProps]
  }
  @scala.inline
  implicit class ShareCountComponentPropsOps[Self <: ShareCountComponentProps] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: /* shareCount */ Double => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

