package typings.reactNativeNavbar.mod

import typings.reactNativeNavbar.reactNativeNavbarStrings.clip
import typings.reactNativeNavbar.reactNativeNavbarStrings.head
import typings.reactNativeNavbar.reactNativeNavbarStrings.middle
import typings.reactNativeNavbar.reactNativeNavbarStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBarTitle extends js.Object {
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
  var numberOfLines: js.UndefOr[Double] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var title: String = js.native
}

object NavigationBarTitle {
  @scala.inline
  def apply(title: String): NavigationBarTitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarTitle]
  }
  @scala.inline
  implicit class NavigationBarTitleOps[Self <: NavigationBarTitle] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipsizeMode(value: head | middle | tail | clip): Self = this.set("ellipsizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsizeMode: Self = this.set("ellipsizeMode", js.undefined)
    @scala.inline
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
  
}

