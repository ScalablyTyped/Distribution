package typings.reactNativeElements.mod

import typings.reactNativeElements.anon.RecursivePartialFullTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProps[T] extends js.Object {
  var replaceTheme: ReplaceTheme = js.native
  var theme: Theme[T] = js.native
  var updateTheme: UpdateTheme = js.native
}

object ThemeProps {
  @scala.inline
  def apply[T](
    replaceTheme: /* updates */ RecursivePartialFullTheme => Unit,
    theme: Theme[T],
    updateTheme: /* updates */ RecursivePartialFullTheme => Unit
  ): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1(replaceTheme), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1(updateTheme))
    __obj.asInstanceOf[ThemeProps[T]]
  }
  @scala.inline
  implicit class ThemePropsOps[Self <: ThemeProps[_], T] (val x: Self with ThemeProps[T]) extends AnyVal {
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
    def setReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = this.set("replaceTheme", js.Any.fromFunction1(value))
    @scala.inline
    def setTheme(value: Theme[T]): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = this.set("updateTheme", js.Any.fromFunction1(value))
  }
  
}

