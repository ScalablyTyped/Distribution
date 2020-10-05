package typings.reactBigCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStatic extends js.Object {
  def navigate(date: Date, action: NavigateAction, props: js.Any): Date = js.native
  def title(date: Date, options: TitleOptions): String = js.native
}

object ViewStatic {
  @scala.inline
  def apply(navigate: (Date, NavigateAction, js.Any) => Date, title: (Date, TitleOptions) => String): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate), title = js.Any.fromFunction2(title))
    __obj.asInstanceOf[ViewStatic]
  }
  @scala.inline
  implicit class ViewStaticOps[Self <: ViewStatic] (val x: Self) extends AnyVal {
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
    def setNavigate(value: (Date, NavigateAction, js.Any) => Date): Self = this.set("navigate", js.Any.fromFunction3(value))
    @scala.inline
    def setTitle(value: (Date, TitleOptions) => String): Self = this.set("title", js.Any.fromFunction2(value))
  }
  
}

